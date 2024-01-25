import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class2_Sub24_Sub2 extends Class2_Sub24 {

	@OriginalMember(owner = "client!ve", name = "Ib", descriptor = "I")
	private int anInt6689;

	@OriginalMember(owner = "client!ve", name = "Kb", descriptor = "Lclient!gg;")
	private Class85 aClass85_1;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I)V")
	public Class2_Sub24_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([BIIZ)V")
	public void method5780(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = (byte) (super.aByteArray100[super.anInt6669++] - this.aClass85_1.method2040());
		}
	}

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "(B)V")
	public void method5782() {
		super.anInt6669 = (this.anInt6689 + 7) / 8;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(IB)V")
	public void method5784(@OriginalArg(0) int arg0) {
		super.aByteArray100[super.anInt6669++] = (byte) (arg0 + this.aClass85_1.method2040());
	}

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "(I)Z")
	public boolean method5785() {
		@Pc(17) int local17 = super.aByteArray100[super.anInt6669] - this.aClass85_1.method2041() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "(I)I")
	public int method5786() {
		@Pc(21) int local21 = super.aByteArray100[super.anInt6669++] - this.aClass85_1.method2040() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (super.aByteArray100[super.anInt6669++] - this.aClass85_1.method2040() & 0xFF);
	}

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "(II)I")
	public int method5787(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt6689;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([IB)V")
	public void method5789(@OriginalArg(0) int[] arg0) {
		this.aClass85_1 = new Class85(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "(I)V")
	public void method5792() {
		this.anInt6689 = super.anInt6669 * 8;
	}

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "(II)I")
	public int method5793(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = this.anInt6689 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt6689 & 0x7);
		@Pc(25) int local25 = 0;
		this.anInt6689 += arg0;
		while (arg0 > local23) {
			local25 += (Static18.anIntArray28[local23] & super.aByteArray100[local15++]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (arg0 == local23) {
			local25 += Static18.anIntArray28[local23] & super.aByteArray100[local15];
		} else {
			local25 += super.aByteArray100[local15] >> local23 - arg0 & Static18.anIntArray28[arg0];
		}
		return local25;
	}
}
