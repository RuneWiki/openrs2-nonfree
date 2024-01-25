import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class367 {

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "Lclient!eda;")
	private final Class87 aClass87_241 = new Class87(64);

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "Lclient!la;")
	private final Class207 aClass207_122;

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
	public final int anInt10199;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class367(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_122 = arg2;
		this.anInt10199 = this.aClass207_122.method4672(19);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)Lclient!ma;")
	public Class224 method8689(@OriginalArg(0) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_241;
		@Pc(16) Class224 local16;
		synchronized (this.aClass87_241) {
			local16 = (Class224) this.aClass87_241.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class207 local29 = this.aClass207_122;
		@Pc(38) byte[] local38;
		synchronized (this.aClass207_122) {
			local38 = this.aClass207_122.method4681(19, arg0);
		}
		local16 = new Class224();
		if (local38 != null) {
			local16.method4981(new Class5_Sub22(local38));
		}
		@Pc(68) Class87 local68 = this.aClass87_241;
		synchronized (this.aClass87_241) {
			this.aClass87_241.method1792((long) arg0, local16);
			return local16;
		}
	}
}
