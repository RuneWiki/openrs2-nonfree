import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class50 {

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!eda;")
	private final Class87 aClass87_42 = new Class87(64);

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Lclient!la;")
	private final Class207 aClass207_18;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!la;")
	private final Class207 aClass207_19;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(ILclient!la;Lclient!la;)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class207 arg2) {
		this.aClass207_18 = arg2;
		this.aClass207_19 = arg1;
		if (this.aClass207_19 != null) {
			this.aClass207_19.method4672(0);
		}
		if (this.aClass207_18 != null) {
			this.aClass207_18.method4672(0);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Lclient!uv;")
	public Class5_Sub5_Sub20 method1055(@OriginalArg(1) int arg0) {
		@Pc(16) Class5_Sub5_Sub20 local16 = (Class5_Sub5_Sub20) this.aClass87_42.method1805((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(30) byte[] local30;
		if (arg0 < 32768) {
			local30 = this.aClass207_19.method4681(0, arg0);
		} else {
			local30 = this.aClass207_18.method4681(0, arg0 & 0x7FFF);
		}
		local16 = new Class5_Sub5_Sub20();
		if (local30 != null) {
			local16.method8399(new Class5_Sub22(local30));
		}
		if (arg0 >= 32768) {
			local16.method8400();
		}
		this.aClass87_42.method1792((long) arg0, local16);
		return local16;
	}
}
