import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class2_Sub20_Sub2 extends Class2_Sub20 {

	@OriginalMember(owner = "client!tw", name = "ec", descriptor = "[Lclient!wda;")
	private static final Class396[] aClass396Array1 = new Class396[32];

	@OriginalMember(owner = "client!tw", name = "dc", descriptor = "I")
	private int anInt9739;

	@OriginalMember(owner = "client!tw", name = "Vb", descriptor = "Lclient!bp;")
	private Class48 aClass48_2;

	static {
		@Pc(164) Class396[] local164 = Static225.method3229();
		for (@Pc(166) int local166 = 0; local166 < local164.length; local166++) {
			aClass396Array1[local164[local166].anInt10768] = local164[local166];
		}
	}

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(I)V")
	public Class2_Sub20_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tw", name = "o", descriptor = "(II)I")
	public int method8599(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt9739;
	}

	@OriginalMember(owner = "client!tw", name = "p", descriptor = "(B)Z")
	public boolean method8600() {
		@Pc(17) int local17 = super.aByteArray111[super.anInt9723] - this.aClass48_2.method926() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILclient!bp;)V")
	public void method8601(@OriginalArg(1) Class48 arg0) {
		this.aClass48_2 = arg0;
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(III[B)V")
	public void method8602(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0; local8++) {
			arg1[local8] = (byte) (super.aByteArray111[super.anInt9723++] - this.aClass48_2.method924());
		}
	}

	@OriginalMember(owner = "client!tw", name = "x", descriptor = "(I)I")
	public int method8604() {
		@Pc(21) int local21 = super.aByteArray111[super.anInt9723++] - this.aClass48_2.method924() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (super.aByteArray111[super.anInt9723++] - this.aClass48_2.method924() & 0xFF);
	}

	@OriginalMember(owner = "client!tw", name = "w", descriptor = "(I)V")
	public void method8605() {
		super.anInt9723 = (this.anInt9739 + 7) / 8;
	}

	@OriginalMember(owner = "client!tw", name = "n", descriptor = "(II)V")
	public void method8606(@OriginalArg(1) int arg0) {
		super.aByteArray111[super.anInt9723++] = (byte) (this.aClass48_2.method924() + arg0);
	}

	@OriginalMember(owner = "client!tw", name = "o", descriptor = "(B)V")
	public void method8607() {
		this.anInt9739 = super.anInt9723 * 8;
	}

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "(IB)I")
	public int method8608(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt9739 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt9739 & 0x7);
		@Pc(19) int local19 = 0;
		this.anInt9739 += arg0;
		while (local17 < arg0) {
			local19 += (Static44.anIntArray55[local17] & super.aByteArray111[local10++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (arg0 == local17) {
			local19 += Static44.anIntArray55[local17] & super.aByteArray111[local10];
		} else {
			local19 += super.aByteArray111[local10] >> local17 - arg0 & Static44.anIntArray55[arg0];
		}
		return local19;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(B[I)V")
	public void method8609(@OriginalArg(1) int[] arg0) {
		this.aClass48_2 = new Class48(arg0);
	}
}
