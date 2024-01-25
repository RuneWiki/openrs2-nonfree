import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "Eb", descriptor = "Lclient!uh;")
	private Class238 aClass238_1;

	@OriginalMember(owner = "client!a", name = "Hb", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I[BII)V")
	public void method143(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (super.aByteArray66[super.anInt5056++] - this.aClass238_1.method5458());
		}
	}

	@OriginalMember(owner = "client!a", name = "t", descriptor = "(I)V")
	public void method144() {
		this.anInt151 = super.anInt5056 * 8;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[I)V")
	public void method145(@OriginalArg(1) int[] arg0) {
		this.aClass238_1 = new Class238(arg0);
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(BI)I")
	public int method146(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt151 >> 3;
		@Pc(25) int local25 = 8 - (this.anInt151 & 0x7);
		this.anInt151 += arg0;
		@Pc(33) int local33 = 0;
		while (arg0 > local25) {
			local33 += (super.aByteArray66[local10++] & Static199.anIntArray301[local25]) << arg0 - local25;
			arg0 -= local25;
			local25 = 8;
		}
		if (local25 == arg0) {
			local33 += super.aByteArray66[local10] & Static199.anIntArray301[local25];
		} else {
			local33 += super.aByteArray66[local10] >> local25 - arg0 & Static199.anIntArray301[arg0];
		}
		return local33;
	}

	@OriginalMember(owner = "client!a", name = "n", descriptor = "(B)V")
	public void method148() {
		super.anInt5056 = (this.anInt151 + 7) / 8;
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(IB)V")
	public void method149(@OriginalArg(0) int arg0) {
		super.aByteArray66[super.anInt5056++] = (byte) (this.aClass238_1.method5458() + arg0);
	}

	@OriginalMember(owner = "client!a", name = "k", descriptor = "(II)I")
	public int method150(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt151;
	}

	@OriginalMember(owner = "client!a", name = "u", descriptor = "(I)Z")
	public boolean method152() {
		@Pc(16) int local16 = super.aByteArray66[super.anInt5056] - this.aClass238_1.method5457() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!a", name = "o", descriptor = "(B)I")
	public int method153() {
		@Pc(22) int local22 = super.aByteArray66[super.anInt5056++] - this.aClass238_1.method5458() & 0xFF;
		return local22 < 128 ? local22 : (local22 - 128 << 8) + (super.aByteArray66[super.anInt5056++] - this.aClass238_1.method5458() & 0xFF);
	}
}
