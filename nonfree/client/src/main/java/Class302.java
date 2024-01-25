import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class302 implements Interface2 {

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "Lclient!ica;")
	private Class127 aClass127_45 = new Class127(128);

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "[I")
	public final int[] anIntArray692 = new int[Static266.aClass230_1.anInt7083];

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "[I")
	private final int[] anIntArray691 = new int[Static266.aClass230_1.anInt7083];

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
	public void method7515() {
		for (@Pc(11) int local11 = 0; local11 < Static266.aClass230_1.anInt7083; local11++) {
			@Pc(18) Class43 local18 = Static266.aClass230_1.method6002(local11);
			if (local18 != null && local18.anInt1478 == 0) {
				this.anIntArray691[local11] = 0;
				this.anIntArray692[local11] = 0;
			}
		}
		this.aClass127_45 = new Class127(128);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IBI)V")
	public void method7516(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class78 local10 = Static79.aClass80_1.method2314(arg0);
		@Pc(13) int local13 = local10.anInt2324;
		@Pc(16) int local16 = local10.anInt2325;
		@Pc(19) int local19 = local10.anInt2322;
		@Pc(26) int local26 = Class1_Sub1_Sub2_Sub2.anIntArray451[local19 - local16];
		if (arg1 < 0 || arg1 > local26) {
			arg1 = 0;
		}
		local26 <<= local16;
		this.method7518(local13, local26 & arg1 << local16 | this.anIntArray692[local13] & ~local26);
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(II)I")
	@Override
	public int method7514(@OriginalArg(0) int arg0) {
		@Pc(8) Class78 local8 = Static79.aClass80_1.method2314(arg0);
		@Pc(11) int local11 = local8.anInt2324;
		@Pc(14) int local14 = local8.anInt2325;
		@Pc(22) int local22 = local8.anInt2322;
		@Pc(28) int local28 = Class1_Sub1_Sub2_Sub2.anIntArray451[local22 - local14];
		return local28 & this.anIntArray692[local11] >> local14;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)I")
	@Override
	public int method7513(@OriginalArg(1) int arg0) {
		return this.anIntArray692[arg0];
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)V")
	public void method7517(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray691[arg1] = arg0;
		@Pc(21) Class2_Sub2 local21 = (Class2_Sub2) this.aClass127_45.method3205((long) arg1);
		if (local21 == null) {
			local21 = new Class2_Sub2(4611686018427387905L);
			this.aClass127_45.method3213(local21, (long) arg1);
		} else if (local21.aLong5 != 4611686018427387905L) {
			local21.aLong5 = Static143.method2502() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIZ)V")
	public void method7518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray692[arg0] = arg1;
		@Pc(28) Class2_Sub2 local28 = (Class2_Sub2) this.aClass127_45.method3205((long) arg0);
		if (local28 == null) {
			local28 = new Class2_Sub2(Static143.method2502() + 500L);
			this.aClass127_45.method3213(local28, (long) arg0);
		} else {
			local28.aLong5 = Static143.method2502() + 500L;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IZ)I")
	public int method7519(@OriginalArg(1) boolean arg0) {
		@Pc(6) long local6 = Static143.method2502();
		for (@Pc(20) Class2_Sub2 local20 = arg0 ? (Class2_Sub2) this.aClass127_45.method3203() : (Class2_Sub2) this.aClass127_45.method3212(); local20 != null; local20 = (Class2_Sub2) this.aClass127_45.method3212()) {
			if ((local20.aLong5 & 0x3FFFFFFFFFFFFFFFL) < local6) {
				if ((local20.aLong5 & 0x4000000000000000L) != 0L) {
					@Pc(43) int local43 = (int) local20.aLong241;
					this.anIntArray692[local43] = this.anIntArray691[local43];
					local20.method7802();
					return local43;
				}
				local20.method7802();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(III)V")
	public void method7520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class78 local10 = Static79.aClass80_1.method2314(arg0);
		@Pc(13) int local13 = local10.anInt2324;
		@Pc(16) int local16 = local10.anInt2325;
		@Pc(19) int local19 = local10.anInt2322;
		@Pc(26) int local26 = Class1_Sub1_Sub2_Sub2.anIntArray451[local19 - local16];
		if (arg1 < 0 || local26 < arg1) {
			arg1 = 0;
		}
		local26 <<= local16;
		this.method7517(local26 & arg1 << local16 | ~local26 & this.anIntArray691[local13], local13);
	}
}
