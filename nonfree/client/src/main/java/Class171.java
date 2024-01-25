import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class171 {

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
	public int anInt4382 = 0;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
	public int anInt4384 = 0;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "Lclient!qr;")
	private final Class293 aClass293_36 = new Class293(64);

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "Lclient!dea;")
	private Interface9 anInterface9_1 = null;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "Lclient!wu;")
	private final Class384 aClass384_66;

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "Lclient!wu;")
	private final Class384 aClass384_67;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(ILclient!wu;Lclient!wu;Lclient!dea;)V")
	public Class171(@OriginalArg(0) int arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class384 arg2, @OriginalArg(3) Interface9 arg3) {
		this.anInterface9_1 = arg3;
		this.aClass384_66 = arg1;
		this.aClass384_67 = arg2;
		if (this.aClass384_66 != null) {
			this.anInt4384 = this.aClass384_66.method8862(1);
		}
		if (this.aClass384_67 != null) {
			this.anInt4382 = this.aClass384_67.method8862(1);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!kg;JB[I)Ljava/lang/String;")
	public String method4003(@OriginalArg(0) Class186 arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int[] arg2) {
		if (this.anInterface9_1 != null) {
			@Pc(14) String local14 = this.anInterface9_1.method4987(arg2, arg1, arg0);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)Lclient!wg;")
	public Class5_Sub4_Sub21 method4004(@OriginalArg(1) int arg0) {
		@Pc(11) Class5_Sub4_Sub21 local11 = (Class5_Sub4_Sub21) this.aClass293_36.method6921((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = this.aClass384_66.method8885(1, arg0);
		} else {
			local27 = this.aClass384_67.method8885(1, arg0 & 0x7FFF);
		}
		local11 = new Class5_Sub4_Sub21();
		local11.aClass171_2 = this;
		if (local27 != null) {
			local11.method8747(new Class5_Sub12(local27));
		}
		if (arg0 >= 32768) {
			local11.method8746();
		}
		this.aClass293_36.method6925((long) arg0, local11);
		return local11;
	}
}
