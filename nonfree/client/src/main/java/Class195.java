import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public final class Class195 {

	@OriginalMember(owner = "client!kfa", name = "f", descriptor = "Lclient!eda;")
	private final Class87 aClass87_125 = new Class87(64);

	@OriginalMember(owner = "client!kfa", name = "i", descriptor = "Lclient!la;")
	private final Class207 aClass207_62;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!cr;ILclient!la;)V")
	public Class195(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_62 = arg2;
		this.aClass207_62.method4672(5);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BI)Lclient!ffa;")
	public Class5_Sub5_Sub7 method4493(@OriginalArg(1) int arg0) {
		@Pc(6) Class87 local6 = this.aClass87_125;
		@Pc(16) Class5_Sub5_Sub7 local16;
		synchronized (this.aClass87_125) {
			local16 = (Class5_Sub5_Sub7) this.aClass87_125.method1805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) Class207 local34 = this.aClass207_62;
		@Pc(43) byte[] local43;
		synchronized (this.aClass207_62) {
			local43 = this.aClass207_62.method4681(5, arg0);
		}
		local16 = new Class5_Sub5_Sub7();
		if (local43 != null) {
			local16.method2198(new Class5_Sub22(local43));
		}
		@Pc(65) Class87 local65 = this.aClass87_125;
		synchronized (this.aClass87_125) {
			this.aClass87_125.method1792((long) arg0, local16);
			return local16;
		}
	}
}
