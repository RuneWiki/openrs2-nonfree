import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class236 {

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "Lclient!mk;")
	private Class2_Sub2 aClass2_Sub2_39 = new Class2_Sub2();

	@OriginalMember(owner = "client!nfa", name = "l", descriptor = "Lclient!oga;")
	private final Class253 aClass253_4 = new Class253();

	@OriginalMember(owner = "client!nfa", name = "i", descriptor = "I")
	private final int anInt6049;

	@OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
	private int anInt6050;

	@OriginalMember(owner = "client!nfa", name = "k", descriptor = "Lclient!efa;")
	private final Class90 aClass90_20;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(I)V")
	public Class236(@OriginalArg(0) int arg0) {
		this.anInt6049 = arg0;
		this.anInt6050 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass90_20 = new Class90(local19);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!mk;BJ)V")
	public void method5071(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt6050 == 0) {
			@Pc(25) Class2_Sub2 local25 = this.aClass253_4.method5327();
			local25.method7657();
			local25.method7659();
			if (this.aClass2_Sub2_39 == local25) {
				local25 = this.aClass253_4.method5327();
				local25.method7657();
				local25.method7659();
			}
		} else {
			this.anInt6050--;
		}
		this.aClass90_20.method1684(arg0, arg1);
		this.aClass253_4.method5329(arg0);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)V")
	public void method5074() {
		this.aClass253_4.method5320();
		this.aClass90_20.method1678();
		this.aClass2_Sub2_39 = new Class2_Sub2();
		this.anInt6050 = this.anInt6049;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IJ)Lclient!mk;")
	public Class2_Sub2 method5075(@OriginalArg(1) long arg0) {
		@Pc(16) Class2_Sub2 local16 = (Class2_Sub2) this.aClass90_20.method1685(arg0);
		if (local16 != null) {
			this.aClass253_4.method5329(local16);
		}
		return local16;
	}
}
