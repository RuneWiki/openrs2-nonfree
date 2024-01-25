import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class287 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_66 = new Class288(64);

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!gp;")
	private final Class117 aClass117_210;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
	public final int anInt8350;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!jc;ILclient!gp;)V")
	public Class287(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2) {
		this.aClass117_210 = arg2;
		if (this.aClass117_210 == null) {
			this.anInt8350 = 0;
		} else {
			this.anInt8350 = this.aClass117_210.method2951(16);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public void method6721() {
		@Pc(2) Class288 local2 = this.aClass288_66;
		synchronized (this.aClass288_66) {
			this.aClass288_66.method6744();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lclient!hba;")
	public Class123 method6723(@OriginalArg(1) int arg0) {
		@Pc(6) Class288 local6 = this.aClass288_66;
		@Pc(16) Class123 local16;
		synchronized (this.aClass288_66) {
			local16 = (Class123) this.aClass288_66.method6745((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class117 local29 = this.aClass117_210;
		@Pc(43) byte[] local43;
		synchronized (this.aClass117_210) {
			local43 = this.aClass117_210.method2962(arg0, 16);
		}
		local16 = new Class123();
		if (local43 != null) {
			local16.method3053(new Class5_Sub3(local43));
		}
		@Pc(65) Class288 local65 = this.aClass288_66;
		synchronized (this.aClass288_66) {
			this.aClass288_66.method6746(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public void method6725() {
		@Pc(6) Class288 local6 = this.aClass288_66;
		synchronized (this.aClass288_66) {
			this.aClass288_66.method6742();
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
	public void method6728() {
		@Pc(12) Class288 local12 = this.aClass288_66;
		synchronized (this.aClass288_66) {
			this.aClass288_66.method6735(5);
		}
	}
}
