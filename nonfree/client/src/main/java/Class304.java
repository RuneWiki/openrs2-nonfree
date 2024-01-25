import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class304 {

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
	public int anInt8226 = 0;

	@OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
	public int anInt8228 = 0;

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "Lclient!tb;")
	private final Class313 aClass313_49 = new Class313(64);

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "Lclient!lv;")
	private Interface15 anInterface15_1 = null;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Lclient!pl;")
	private final Class259 aClass259_149;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!pl;")
	private final Class259 aClass259_148;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(ILclient!pl;Lclient!pl;Lclient!lv;)V")
	public Class304(@OriginalArg(0) int arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) Interface15 arg3) {
		this.anInterface15_1 = arg3;
		this.aClass259_149 = arg2;
		this.aClass259_148 = arg1;
		if (this.aClass259_148 != null) {
			this.anInt8228 = this.aClass259_148.method5969(1);
		}
		if (this.aClass259_149 != null) {
			this.anInt8226 = this.aClass259_149.method5969(1);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!baa;JI[I)Ljava/lang/String;")
	public String method6808(@OriginalArg(0) Class28 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface15_1 != null) {
			@Pc(22) String local22 = this.anInterface15_1.method1453(arg1, arg2, arg0);
			if (local22 != null) {
				return local22;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IB)Lclient!uj;")
	public Class2_Sub3_Sub18 method6809(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub3_Sub18 local11 = (Class2_Sub3_Sub18) this.aClass313_49.method6989((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(32) byte[] local32;
		if (arg0 >= 32768) {
			local32 = this.aClass259_149.method5985(arg0 & 0x7FFF, 1);
		} else {
			local32 = this.aClass259_148.method5985(arg0, 1);
		}
		local11 = new Class2_Sub3_Sub18();
		local11.aClass304_1 = this;
		if (local32 != null) {
			local11.method7358(new Class2_Sub15(local32));
		}
		if (arg0 >= 32768) {
			local11.method7366();
		}
		this.aClass313_49.method6980((long) arg0, local11);
		return local11;
	}
}
