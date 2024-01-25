import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class4_Sub6_Sub16 extends Class4_Sub6 {

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
	private int anInt3435;

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
	private int anInt3436;

	@OriginalMember(owner = "client!kc", name = "P", descriptor = "[I")
	private int[] anIntArray301;

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
	private int anInt3441 = -1;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub16() {
		super(0, false);
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)I")
	@Override
	public int method5703() {
		return this.anInt3441;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method5692(arg0, arg1);
		if (this.anInt3441 >= 0 && Static33.anInterface3_1 != null) {
			@Pc(24) int local24 = Static33.anInterface3_1.method5441(this.anInt3441).aBoolean256 ? 64 : 128;
			this.anIntArray301 = Static33.anInterface3_1.method5442(local24, false, 1.0F, local24, this.anInt3441);
			this.anInt3436 = local24;
			this.anInt3435 = local24;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(43) int local43 = (this.anInt3436 == Static223.anInt4562 ? arg0 : arg0 * this.anInt3436 / Static223.anInt4562) * this.anInt3435;
			@Pc(47) int[] local47 = local19[0];
			@Pc(51) int[] local51 = local19[1];
			@Pc(55) int[] local55 = local19[2];
			@Pc(61) int local61;
			@Pc(70) int local70;
			if (Static31.anInt797 == this.anInt3435) {
				for (local61 = 0; local61 < Static31.anInt797; local61++) {
					local70 = this.anIntArray301[local43++];
					local55[local61] = (local70 & 0xFF) << 4;
					local51[local61] = local70 >> 4 & 0xFF0;
					local47[local61] = local70 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static31.anInt797; local61++) {
					local70 = this.anInt3435 * local61 / Static31.anInt797;
					@Pc(77) int local77 = this.anIntArray301[local43 + local70];
					local55[local61] = (local77 & 0xFF) << 4;
					local51[local61] = local77 >> 4 & 0xFF0;
					local47[local61] = local77 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3441 = arg1.method3401();
		}
	}

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "(B)V")
	@Override
	public void method5699() {
		super.method5699();
		this.anIntArray301 = null;
	}
}
