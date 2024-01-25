import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wha")
public final class Class385 {

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "Lclient!oo;")
	private final Class264 aClass264_66 = new Class264(16);

	@OriginalMember(owner = "client!wha", name = "j", descriptor = "Lclient!wia;")
	private final Class386 aClass386_140;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lclient!dt;ILclient!wia;)V")
	public Class385(@OriginalArg(0) Class77 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class386 arg2) {
		this.aClass386_140 = arg2;
		this.aClass386_140.method9210(29);
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(BI)V")
	public void method9137() {
		@Pc(2) Class264 local2 = this.aClass264_66;
		synchronized (this.aClass264_66) {
			this.aClass264_66.method6366(5);
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V")
	public void method9138() {
		@Pc(6) Class264 local6 = this.aClass264_66;
		synchronized (this.aClass264_66) {
			this.aClass264_66.method6360();
		}
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(B)V")
	public void method9139() {
		@Pc(12) Class264 local12 = this.aClass264_66;
		synchronized (this.aClass264_66) {
			this.aClass264_66.method6368();
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ZI)Lclient!nl;")
	private Class249 method9141(@OriginalArg(1) int arg0) {
		@Pc(6) Class264 local6 = this.aClass264_66;
		@Pc(16) Class249 local16;
		synchronized (this.aClass264_66) {
			local16 = (Class249) this.aClass264_66.method6367((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class386 local29 = this.aClass386_140;
		@Pc(38) byte[] local38;
		synchronized (this.aClass386_140) {
			local38 = this.aClass386_140.method9196(arg0, 29);
		}
		local16 = new Class249();
		if (local38 != null) {
			local16.method5991(new Class14_Sub29(local38));
		}
		@Pc(60) Class264 local60 = this.aClass264_66;
		synchronized (this.aClass264_66) {
			this.aClass264_66.method6364((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIIIILclient!nn;)Lclient!iaa;")
	public Class153 method9142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class250 arg4) {
		@Pc(17) Class164[] local17 = null;
		@Pc(22) Class249 local22 = this.method9141(arg3);
		if (local22.anIntArray535 != null) {
			local17 = new Class164[local22.anIntArray535.length];
			for (@Pc(32) int local32 = 0; local32 < local17.length; local32++) {
				@Pc(42) Class218 local42 = arg4.method5999(local22.anIntArray535[local32]);
				local17[local32] = new Class164(local42.anInt6378, local42.anInt6373, local42.anInt6374, local42.anInt6380, local42.anInt6375, local42.anInt6381, local42.anInt6377, local42.aBoolean436);
			}
		}
		return new Class153(local22.anInt7387, local17, local22.anInt7384, arg1, arg0, arg2);
	}
}
