import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kda")
public final class Class186 {

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "Lclient!gw;")
	private final Class136 aClass136_35 = new Class136(64);

	@OriginalMember(owner = "client!kda", name = "j", descriptor = "Lclient!uu;")
	private final Class343 aClass343_146;

	@OriginalMember(owner = "client!kda", name = "k", descriptor = "I")
	public final int anInt5551;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lclient!gp;ILclient!uu;)V")
	public Class186(@OriginalArg(0) Class133 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_146 = arg2;
		if (this.aClass343_146 == null) {
			this.anInt5551 = 0;
		} else {
			this.anInt5551 = this.aClass343_146.method8157(16);
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)V")
	public void method4741() {
		@Pc(2) Class136 local2 = this.aClass136_35;
		synchronized (this.aClass136_35) {
			this.aClass136_35.method3138();
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZI)Lclient!aja;")
	public Class13 method4744(@OriginalArg(1) int arg0) {
		@Pc(6) Class136 local6 = this.aClass136_35;
		@Pc(16) Class13 local16;
		synchronized (this.aClass136_35) {
			local16 = (Class13) this.aClass136_35.method3134((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class343 local29 = this.aClass343_146;
		@Pc(38) byte[] local38;
		synchronized (this.aClass343_146) {
			local38 = this.aClass343_146.method8132(16, arg0);
		}
		local16 = new Class13();
		if (local38 != null) {
			local16.method249(new Class3_Sub9(local38));
		}
		@Pc(60) Class136 local60 = this.aClass136_35;
		synchronized (this.aClass136_35) {
			this.aClass136_35.method3135(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)V")
	public void method4748() {
		@Pc(7) Class136 local7 = this.aClass136_35;
		synchronized (this.aClass136_35) {
			this.aClass136_35.method3142();
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IZ)V")
	public void method4749() {
		@Pc(2) Class136 local2 = this.aClass136_35;
		synchronized (this.aClass136_35) {
			this.aClass136_35.method3132(5);
		}
	}
}
