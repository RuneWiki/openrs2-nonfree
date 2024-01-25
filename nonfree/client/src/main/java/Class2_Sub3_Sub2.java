import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
	private int anInt354 = 4096;

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "Z")
	private boolean aBoolean27 = true;

	static {
		new Class140("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(30) int[] local30 = this.method5700(0, Static241.anInt5135 & arg0 - 1);
			@Pc(36) int[] local36 = this.method5700(0, arg0);
			@Pc(46) int[] local46 = this.method5700(0, arg0 + 1 & Static241.anInt5135);
			@Pc(50) int[] local50 = local16[0];
			@Pc(54) int[] local54 = local16[1];
			@Pc(58) int[] local58 = local16[2];
			for (@Pc(60) int local60 = 0; local60 < Static263.anInt5504; local60++) {
				@Pc(74) int local74 = (local46[local60] - local30[local60]) * this.anInt354;
				@Pc(94) int local94 = this.anInt354 * (local36[local60 + 1 & Static171.anInt3863] - local36[Static171.anInt3863 & local60 - 1]);
				@Pc(98) int local98 = local94 >> 12;
				@Pc(102) int local102 = local74 >> 12;
				@Pc(108) int local108 = local98 * local98 >> 12;
				@Pc(114) int local114 = local102 * local102 >> 12;
				@Pc(128) int local128 = (int) (Math.sqrt((double) ((float) (local114 + local108 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(134) int local134;
				@Pc(138) int local138;
				@Pc(142) int local142;
				if (local128 == 0) {
					local138 = 0;
					local142 = 0;
					local134 = 0;
				} else {
					local134 = local94 / local128;
					local138 = local74 / local128;
					local142 = 16777216 / local128;
				}
				if (this.aBoolean27) {
					local134 = (local134 >> 1) + 2048;
					local138 = (local138 >> 1) + 2048;
					local142 = (local142 >> 1) + 2048;
				}
				local50[local60] = local134;
				local54[local60] = local138;
				local58[local60] = local142;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt354 = arg1.method3104();
		} else if (arg0 == 1) {
			this.aBoolean27 = arg1.method3124() == 1;
		}
	}
}
