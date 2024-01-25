import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class134 {

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "Lclient!bga;")
	private Class35 aClass35_2;

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "Lclient!la;")
	private final Class207 aClass207_42;

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "Lclient!la;")
	private final Class207 aClass207_41;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!la;Lclient!la;)V")
	public Class134(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class207 arg1) {
		this.aClass207_42 = arg0;
		this.aClass207_41 = arg1;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILclient!jo;)Lclient!ug;")
	public Interface25 method3031(@OriginalArg(1) Interface9 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class365 local11 = arg0.method9019();
		if (Static613.aClass365_17 == local11) {
			return new Class24((Class314) arg0);
		} else if (Static310.aClass365_11 == local11) {
			return new Class62(this.method3035(), (Class146) arg0);
		} else if (Static522.aClass365_15 == local11) {
			return new Class129(this.aClass207_42, (Class177) arg0);
		} else if (Static76.aClass365_4 == local11) {
			return new Class129_Sub1(this.aClass207_42, (Class177_Sub1) arg0);
		} else if (Static21.aClass365_1 == local11) {
			return new Class31_Sub1(this.aClass207_42, this.aClass207_41, (Class119_Sub2) arg0);
		} else if (Static609.aClass365_16 == local11) {
			return new Class31_Sub3(this.aClass207_42, this.aClass207_41, (Class119_Sub3) arg0);
		} else if (local11 == Static392.aClass365_14) {
			return new Class31_Sub2(this.aClass207_42, this.aClass207_41, (Class119_Sub1) arg0);
		} else if (Static343.aClass365_13 == local11) {
			return new Class38(this.aClass207_42, this.aClass207_41, (Class380) arg0);
		} else if (local11 == Static197.aClass365_18) {
			return new Class188(this.aClass207_42, (Class185) arg0);
		} else if (Static516.aClass365_12 == local11) {
			return new Class31_Sub2_Sub1(this.aClass207_42, this.aClass207_41, (Class119_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(I)Lclient!bga;")
	private Class35 method3035() {
		if (this.aClass35_2 == null) {
			this.aClass35_2 = new Class35();
		}
		return this.aClass35_2;
	}
}
