import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class1_Sub8_Sub18 extends Class1_Sub8 {

	@OriginalMember(owner = "client!ut", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!ut", name = "E", descriptor = "[Lclient!vb;")
	public Class341[] aClass341Array1;

	@OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
	private final int anInt9071;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(I)V")
	public Class1_Sub8_Sub18(@OriginalArg(0) int arg0) {
		this.anInt9071 = arg0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB)Z")
	public boolean method7355(@OriginalArg(0) int arg0) {
		return this.aClass341Array1[arg0].aBoolean683;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)Z")
	public boolean method7356(@OriginalArg(1) int arg0) {
		return this.aClass341Array1[arg0].aBoolean681;
	}

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "(I)Z")
	public boolean method7358() {
		if (this.aClass341Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray24 == null) {
			@Pc(15) Class308 local15 = Static166.aClass308_157;
			synchronized (Static166.aClass308_157) {
				if (!Static166.aClass308_157.method6566(this.anInt9071)) {
					return false;
				}
				local35 = Static166.aClass308_157.method6570(this.anInt9071);
				this.aByteArrayArray24 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray24[local42] = Static166.aClass308_157.method6569(this.anInt9071, local35[local42]);
				}
			}
		}
		@Pc(75) boolean local75 = true;
		for (@Pc(77) int local77 = 0; local77 < this.aByteArrayArray24.length; local77++) {
			@Pc(84) byte[] local84 = this.aByteArrayArray24[local77];
			@Pc(89) Class1_Sub3 local89 = new Class1_Sub3(local84);
			local89.anInt9802 = 1;
			local42 = local89.method7945();
			@Pc(98) Class308 local98 = Static404.aClass308_146;
			synchronized (Static404.aClass308_146) {
				local75 &= Static404.aClass308_146.method6538(local42);
			}
		}
		if (!local75) {
			return false;
		}
		@Pc(133) Class111 local133 = new Class111();
		@Pc(135) Class308 local135 = Static166.aClass308_157;
		synchronized (Static166.aClass308_157) {
			@Pc(143) int local143 = Static166.aClass308_157.method6568(this.anInt9071);
			this.aClass341Array1 = new Class341[local143];
			local35 = Static166.aClass308_157.method6570(this.anInt9071);
		}
		for (local42 = 0; local42 < local35.length; local42++) {
			@Pc(173) byte[] local173 = this.aByteArrayArray24[local42];
			@Pc(178) Class1_Sub3 local178 = new Class1_Sub3(local173);
			local178.anInt9802 = 1;
			@Pc(185) int local185 = local178.method7945();
			@Pc(187) Class1_Sub31 local187 = null;
			for (@Pc(192) Class1_Sub31 local192 = (Class1_Sub31) local133.method2547(); local192 != null; local192 = (Class1_Sub31) local133.method2554()) {
				if (local185 == local192.anInt4744) {
					local187 = local192;
					break;
				}
			}
			if (local187 == null) {
				@Pc(212) Class308 local212 = Static404.aClass308_146;
				synchronized (Static404.aClass308_146) {
					local187 = new Class1_Sub31(local185, Static404.aClass308_146.method6547(local185));
				}
				local133.method2552(local187);
			}
			this.aClass341Array1[local35[local42]] = new Class341(local173, local187);
		}
		this.aByteArrayArray24 = null;
		return true;
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(BI)Z")
	public boolean method7359(@OriginalArg(1) int arg0) {
		return this.aClass341Array1[arg0].aBoolean682;
	}
}
