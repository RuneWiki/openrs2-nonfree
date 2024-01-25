import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class65 {

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "Lclient!ge;")
	private Class2_Sub13 aClass2_Sub13_17 = new Class2_Sub13();

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "Lclient!mc;")
	private final Class185 aClass185_2 = new Class185();

	@OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
	private int anInt1976;

	@OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
	private final int anInt1975;

	@OriginalMember(owner = "client!eaa", name = "i", descriptor = "Lclient!ica;")
	private final Class127 aClass127_19;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(I)V")
	public Class65(@OriginalArg(0) int arg0) {
		this.anInt1976 = arg0;
		this.anInt1975 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass127_19 = new Class127(local19);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(JB)Lclient!ge;")
	public Class2_Sub13 method1918(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub13 local10 = (Class2_Sub13) this.aClass127_19.method3205(arg0);
		if (local10 != null) {
			this.aClass185_2.method4621(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
	public void method1920() {
		this.aClass185_2.method4624();
		this.aClass127_19.method3204();
		this.aClass2_Sub13_17 = new Class2_Sub13();
		this.anInt1976 = this.anInt1975;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(JLclient!ge;I)V")
	public void method1921(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		if (this.anInt1976 == 0) {
			@Pc(19) Class2_Sub13 local19 = this.aClass185_2.method4622();
			local19.method7802();
			local19.method7527();
			if (local19 == this.aClass2_Sub13_17) {
				local19 = this.aClass185_2.method4622();
				local19.method7802();
				local19.method7527();
			}
		} else {
			this.anInt1976--;
		}
		this.aClass127_19.method3213(arg1, arg0);
		this.aClass185_2.method4621(arg1);
	}
}
