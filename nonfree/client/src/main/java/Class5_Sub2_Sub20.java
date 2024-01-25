import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class5_Sub2_Sub20 extends Class5_Sub2 {

	@OriginalMember(owner = "client!va", name = "v", descriptor = "[[B")
	private byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "[Lclient!u;")
	public Class347[] aClass347Array1;

	@OriginalMember(owner = "client!va", name = "A", descriptor = "I")
	private final int anInt9964;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V")
	public Class5_Sub2_Sub20(@OriginalArg(0) int arg0) {
		this.anInt9964 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)Z")
	public boolean method8283(@OriginalArg(1) int arg0) {
		return this.aClass347Array1[arg0].aBoolean705;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(B)Z")
	public boolean method8285() {
		if (this.aClass347Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray21 == null) {
			@Pc(13) Class50 local13 = Static625.aClass50_175;
			synchronized (Static625.aClass50_175) {
				if (!Static625.aClass50_175.method906(this.anInt9964)) {
					return false;
				}
				local35 = Static625.aClass50_175.method905(this.anInt9964);
				this.aByteArrayArray21 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray21[local42] = Static625.aClass50_175.method916(local35[local42], this.anInt9964);
				}
			}
		}
		@Pc(74) boolean local74 = true;
		for (@Pc(76) int local76 = 0; local76 < this.aByteArrayArray21.length; local76++) {
			@Pc(82) byte[] local82 = this.aByteArrayArray21[local76];
			@Pc(87) Class5_Sub15 local87 = new Class5_Sub15(local82);
			local87.anInt4144 = 1;
			local42 = local87.method3698();
			@Pc(96) Class50 local96 = Static40.aClass50_7;
			synchronized (Static40.aClass50_7) {
				local74 &= Static40.aClass50_7.method897(local42);
			}
		}
		if (!local74) {
			return false;
		}
		@Pc(129) Class124 local129 = new Class124();
		@Pc(136) Class50 local136 = Static625.aClass50_175;
		synchronized (Static625.aClass50_175) {
			@Pc(144) int local144 = Static625.aClass50_175.method913(this.anInt9964);
			this.aClass347Array1 = new Class347[local144];
			local35 = Static625.aClass50_175.method905(this.anInt9964);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(168) byte[] local168 = this.aByteArrayArray21[local42];
			@Pc(173) Class5_Sub15 local173 = new Class5_Sub15(local168);
			local173.anInt4144 = 1;
			@Pc(180) int local180 = local173.method3698();
			@Pc(182) Class5_Sub37 local182 = null;
			for (@Pc(187) Class5_Sub37 local187 = (Class5_Sub37) local129.method2572(); local187 != null; local187 = (Class5_Sub37) local129.method2569()) {
				if (local187.anInt6586 == local180) {
					local182 = local187;
					break;
				}
			}
			if (local182 == null) {
				@Pc(210) Class50 local210 = Static40.aClass50_7;
				synchronized (Static40.aClass50_7) {
					local182 = new Class5_Sub37(local180, Static40.aClass50_7.method915(local180));
				}
				local129.method2574(local182);
			}
			this.aClass347Array1[local35[local42]] = new Class347(local168, local182);
		}
		this.aByteArrayArray21 = null;
		return true;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(ZI)Z")
	public boolean method8287(@OriginalArg(1) int arg0) {
		return this.aClass347Array1[arg0].aBoolean703;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Z")
	public boolean method8288(@OriginalArg(0) int arg0) {
		return this.aClass347Array1[arg0].aBoolean704;
	}
}
