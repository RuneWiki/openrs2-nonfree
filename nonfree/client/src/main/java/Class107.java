import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class107 implements Interface26 {

	@OriginalMember(owner = "client!es", name = "p", descriptor = "[C")
	private static final char[] aCharArray4 = new char[64];

	@OriginalMember(owner = "client!es", name = "m", descriptor = "Lclient!lba;")
	private Class218 aClass218_10 = new Class218(128);

	@OriginalMember(owner = "client!es", name = "i", descriptor = "[I")
	public final int[] anIntArray197 = new int[Static13.aClass119_1.anInt2999];

	@OriginalMember(owner = "client!es", name = "k", descriptor = "[I")
	private final int[] anIntArray196 = new int[Static13.aClass119_1.anInt2999];

	static {
		for (@Pc(69) int local69 = 0; local69 < 26; local69++) {
			aCharArray4[local69] = (char) (local69 + 65);
		}
		for (@Pc(85) int local85 = 26; local85 < 52; local85++) {
			aCharArray4[local85] = (char) (local85 + 71);
		}
		for (@Pc(101) int local101 = 52; local101 < 62; local101++) {
			aCharArray4[local101] = (char) (local101 + 48 - 52);
		}
		aCharArray4[63] = '-';
		aCharArray4[62] = '*';
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(III)V")
	public void method2264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray197[arg1] = arg0;
		@Pc(23) Class2_Sub42 local23 = (Class2_Sub42) this.aClass218_10.method5095((long) arg1, 0);
		if (local23 == null) {
			local23 = new Class2_Sub42(Static567.method7863() + 500L);
			this.aClass218_10.method5099(local23, (long) arg1);
		} else {
			local23.aLong198 = Static567.method7863() + 500L;
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(III)V")
	public void method2265(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray196[arg0] = arg1;
		@Pc(24) Class2_Sub42 local24 = (Class2_Sub42) this.aClass218_10.method5095((long) arg0, 0);
		if (local24 == null) {
			local24 = new Class2_Sub42(4611686018427387905L);
			this.aClass218_10.method5099(local24, (long) arg0);
		} else if (local24.aLong198 != 4611686018427387905L) {
			local24.aLong198 = Static567.method7863() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(III)V")
	public void method2266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class216 local10 = Static153.aClass79_3.method1605(arg0);
		@Pc(13) int local13 = local10.anInt5369;
		@Pc(16) int local16 = local10.anInt5363;
		@Pc(19) int local19 = local10.anInt5361;
		@Pc(26) int local26 = Class2_Sub6_Sub21.anIntArray701[local19 - local16];
		if (arg1 < 0 || local26 < arg1) {
			arg1 = 0;
		}
		local26 <<= local16;
		this.method2264(local26 & arg1 << local16 | this.anIntArray197[local13] & ~local26, local13);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IB)I")
	@Override
	public int method5145(@OriginalArg(0) int arg0) {
		return this.anIntArray197[arg0];
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
	public void method2268() {
		for (@Pc(14) int local14 = 0; local14 < Static13.aClass119_1.anInt2999; local14++) {
			@Pc(21) Class391 local21 = Static13.aClass119_1.method2608(local14);
			if (local21 != null && local21.anInt10680 == 0) {
				this.anIntArray196[local14] = 0;
				this.anIntArray197[local14] = 0;
			}
		}
		this.aClass218_10 = new Class218(128);
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(III)V")
	public void method2269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class216 local18 = Static153.aClass79_3.method1605(arg0);
		@Pc(21) int local21 = local18.anInt5369;
		@Pc(24) int local24 = local18.anInt5363;
		@Pc(27) int local27 = local18.anInt5361;
		@Pc(34) int local34 = Class2_Sub6_Sub21.anIntArray701[local27 - local24];
		if (arg1 < 0 || local34 < arg1) {
			arg1 = 0;
		}
		local34 <<= local24;
		this.method2265(local21, ~local34 & this.anIntArray196[local21] | arg1 << local24 & local34);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)I")
	public int method2270(@OriginalArg(1) boolean arg0) {
		@Pc(16) long local16 = Static567.method7863();
		for (@Pc(31) Class2_Sub42 local31 = arg0 ? (Class2_Sub42) this.aClass218_10.method5092() : (Class2_Sub42) this.aClass218_10.method5096(); local31 != null; local31 = (Class2_Sub42) this.aClass218_10.method5096()) {
			if ((local31.aLong198 & 0x3FFFFFFFFFFFFFFFL) < local16) {
				if ((local31.aLong198 & 0x4000000000000000L) != 0L) {
					@Pc(59) int local59 = (int) local31.aLong352;
					this.anIntArray197[local59] = this.anIntArray196[local59];
					local31.method9872();
					return local59;
				}
				local31.method9872();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)I")
	@Override
	public int method5146(@OriginalArg(1) int arg0) {
		@Pc(16) Class216 local16 = Static153.aClass79_3.method1605(arg0);
		@Pc(19) int local19 = local16.anInt5369;
		@Pc(22) int local22 = local16.anInt5363;
		@Pc(25) int local25 = local16.anInt5361;
		@Pc(32) int local32 = Class2_Sub6_Sub21.anIntArray701[local25 - local22];
		return this.anIntArray197[local19] >> local22 & local32;
	}
}
