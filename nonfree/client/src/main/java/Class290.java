import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class290 {

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
	public int anInt7520 = 0;

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
	public int anInt7526 = 0;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Lclient!aj;")
	private final Class10 aClass10_52 = new Class10(64);

	@OriginalMember(owner = "client!rm", name = "n", descriptor = "Lclient!wb;")
	private Interface23 anInterface23_1 = null;

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "Lclient!om;")
	private final Class246 aClass246_216;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "Lclient!om;")
	private final Class246 aClass246_215;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(ILclient!om;Lclient!om;Lclient!wb;)V")
	public Class290(@OriginalArg(0) int arg0, @OriginalArg(1) Class246 arg1, @OriginalArg(2) Class246 arg2, @OriginalArg(3) Interface23 arg3) {
		this.aClass246_216 = arg2;
		this.aClass246_215 = arg1;
		this.anInterface23_1 = arg3;
		if (this.aClass246_215 != null) {
			this.anInt7520 = this.aClass246_215.method5673(1);
		}
		if (this.aClass246_216 != null) {
			this.anInt7526 = this.aClass246_216.method5673(1);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(JILclient!ja;[I)Ljava/lang/String;")
	public String method6376(@OriginalArg(0) long arg0, @OriginalArg(2) Class158 arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface23_1 != null) {
			@Pc(14) String local14 = this.anInterface23_1.method4316(arg0, arg2, arg1);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IB)Lclient!vg;")
	public Class3_Sub3_Sub17 method6377(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub3_Sub17 local16 = (Class3_Sub3_Sub17) this.aClass10_52.method250((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(34) byte[] local34;
		if (arg0 >= 32768) {
			local34 = this.aClass246_216.method5653(1, arg0 & 0x7FFF);
		} else {
			local34 = this.aClass246_215.method5653(1, arg0);
		}
		local16 = new Class3_Sub3_Sub17();
		local16.aClass290_2 = this;
		if (local34 != null) {
			local16.method7457(new Class3_Sub11(local34));
		}
		if (arg0 >= 32768) {
			local16.method7454();
		}
		this.aClass10_52.method254(local16, (long) arg0);
		return local16;
	}
}
