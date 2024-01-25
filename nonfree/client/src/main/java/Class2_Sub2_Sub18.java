import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	@OriginalMember(owner = "client!kq", name = "H", descriptor = "[I")
	private int[] anIntArray360;

	@OriginalMember(owner = "client!kq", name = "L", descriptor = "[I")
	private int[] anIntArray361;

	@OriginalMember(owner = "client!kq", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!kq", name = "M", descriptor = "[S")
	private final short[] aShortArray94 = new short[257];

	@OriginalMember(owner = "client!kq", name = "T", descriptor = "I")
	private int anInt5194 = 0;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub18() {
		super(1, true);
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
	@Override
	public void method7948() {
		if (this.anIntArrayArray32 == null) {
			this.anIntArrayArray32 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray32.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt5194 == 2) {
			this.method4273();
		}
		Static315.method7021();
		this.method4274();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		this.anInt5194 = arg0.method4325();
		this.anIntArrayArray32 = new int[arg0.method4325()][2];
		for (@Pc(26) int local26 = 0; local26 < this.anIntArrayArray32.length; local26++) {
			this.anIntArrayArray32[local26][0] = arg0.method4294();
			this.anIntArrayArray32[local26][1] = arg0.method4294();
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(29) int[] local29 = this.method7951(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static153.anInt3070; local31++) {
				@Pc(39) int local39 = local29[local31] >> 4;
				if (local39 < 0) {
					local39 = 0;
				}
				if (local39 > 256) {
					local39 = 256;
				}
				local19[local31] = this.aShortArray94[local39];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "(I)V")
	private void method4273() {
		@Pc(8) int[] local8 = this.anIntArrayArray32[0];
		@Pc(13) int[] local13 = this.anIntArrayArray32[1];
		@Pc(22) int[] local22 = this.anIntArrayArray32[this.anIntArrayArray32.length - 2];
		@Pc(37) int[] local37 = this.anIntArrayArray32[this.anIntArrayArray32.length - 1];
		this.anIntArray360 = new int[] { local22[0] + local22[0] - local37[0], local22[1] - local37[1] - -local22[1] };
		this.anIntArray361 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] - (-local8[1] - local8[1]) };
	}

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "(I)V")
	private void method4274() {
		@Pc(13) int local13 = this.anInt5194;
		@Pc(33) int local33;
		@Pc(31) int local31;
		@Pc(60) int[] local60;
		@Pc(65) int[] local65;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(91) int local91;
		if (local13 == 2) {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; local33 < this.anIntArrayArray32.length - 1 && this.anIntArrayArray32[local33][0] <= local31; local33++) {
				}
				local60 = this.anIntArrayArray32[local33 - 1];
				local65 = this.anIntArrayArray32[local33];
				local74 = this.method4275(local33 - 2)[1];
				local78 = local60[1];
				local82 = local65[1];
				local91 = this.method4275(local33 + 1)[1];
				@Pc(109) int local109 = (local31 - local60[0] << 12) / (local65[0] - local60[0]);
				@Pc(115) int local115 = local109 * local109 >> 12;
				@Pc(125) int local125 = local91 + local78 - local82 - local74;
				@Pc(133) int local133 = local74 - local125 - local78;
				@Pc(138) int local138 = local82 - local74;
				@Pc(150) int local150 = local115 * (local125 * local109 >> 12) >> 12;
				@Pc(156) int local156 = local115 * local133 >> 12;
				@Pc(162) int local162 = local138 * local109 >> 12;
				@Pc(171) int local171 = local162 + local150 + local156 + local78;
				if (local171 <= -32768) {
					local171 = -32767;
				}
				if (local171 >= 32768) {
					local171 = 32767;
				}
				this.aShortArray94[local13] = (short) local171;
			}
		} else if (local13 == 1) {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; this.anIntArrayArray32.length - 1 > local33 && local31 >= this.anIntArrayArray32[local33][0]; local33++) {
				}
				local60 = this.anIntArrayArray32[local33 - 1];
				local65 = this.anIntArrayArray32[local33];
				local74 = (local31 - local60[0] << 12) / (local65[0] - local60[0]);
				local78 = 4096 - Static388.anIntArray472[local74 >> 5 & 0xFF] >> 1;
				local82 = 4096 - local78;
				local91 = local65[1] * local78 + local60[1] * local82 >> 12;
				if (local91 <= -32768) {
					local91 = -32767;
				}
				if (local91 >= 32768) {
					local91 = 32767;
				}
				this.aShortArray94[local13] = (short) local91;
			}
		} else {
			for (local13 = 0; local13 < 257; local13++) {
				local31 = local13 << 4;
				for (local33 = 1; this.anIntArrayArray32.length - 1 > local33 && this.anIntArrayArray32[local33][0] <= local31; local33++) {
				}
				local60 = this.anIntArrayArray32[local33 - 1];
				local65 = this.anIntArrayArray32[local33];
				local74 = (local31 - local60[0] << 12) / (local65[0] - local60[0]);
				local78 = 4096 - local74;
				local82 = local65[1] * local74 + local78 * local60[1] >> 12;
				if (local82 <= -32768) {
					local82 = -32767;
				}
				if (local82 >= 32768) {
					local82 = 32767;
				}
				this.aShortArray94[local13] = (short) local82;
			}
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)[I")
	private int[] method4275(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray361;
		} else if (arg0 >= this.anIntArrayArray32.length) {
			return this.anIntArray360;
		} else {
			return this.anIntArrayArray32[arg0];
		}
	}
}
