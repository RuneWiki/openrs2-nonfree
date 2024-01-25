import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class4_Sub4_Sub17 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
	private int anInt4888;

	@OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
	private int anInt4889;

	@OriginalMember(owner = "client!ji", name = "Q", descriptor = "[I")
	private int[] anIntArray433;

	@OriginalMember(owner = "client!ji", name = "P", descriptor = "I")
	private int anInt4891 = -1;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub17() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(35) int local35 = this.anInt4889 * (Static278.anInt5214 == this.anInt4888 ? arg0 : arg0 * this.anInt4888 / Static278.anInt5214);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(57) int local57;
			@Pc(66) int local66;
			if (Static560.anInt9394 == this.anInt4889) {
				for (local57 = 0; local57 < Static560.anInt9394; local57++) {
					local66 = this.anIntArray433[local35++];
					local47[local57] = (local66 & 0xFF) << 4;
					local43[local57] = local66 >> 4 & 0xFF0;
					local39[local57] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static560.anInt9394; local57++) {
					local66 = local57 * this.anInt4889 / Static560.anInt9394;
					@Pc(74) int local74 = this.anIntArray433[local35 + local66];
					local47[local57] = (local74 & 0xFF) << 4;
					local43[local57] = local74 >> 4 & 0xFF0;
					local39[local57] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4891 = arg1.method5982();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
	@Override
	public void method7882() {
		super.method7882();
		this.anIntArray433 = null;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
	@Override
	public void method7885(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.method7885(arg0, arg1);
		if (this.anInt4891 >= 0 && Static301.anInterface3_10 != null) {
			@Pc(26) int local26 = Static301.anInterface3_10.method7249(this.anInt4891).aBoolean516 ? 64 : 128;
			this.anIntArray433 = Static301.anInterface3_10.method7250(local26, false, this.anInt4891, 1.0F, local26);
			this.anInt4889 = local26;
			this.anInt4888 = local26;
		}
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)I")
	@Override
	public int method7889() {
		return this.anInt4891;
	}
}
