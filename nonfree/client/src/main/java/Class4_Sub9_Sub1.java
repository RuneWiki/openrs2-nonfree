import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class4_Sub9_Sub1 extends Class4_Sub9 {

	@OriginalMember(owner = "client!ie", name = "Sb", descriptor = "Lclient!nd;")
	private Class55 aClass55_1;

	@OriginalMember(owner = "client!ie", name = "Vb", descriptor = "I")
	private int anInt1349;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
	public Class4_Sub9_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "(II)I")
	public int method825(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1349;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(IB)V")
	public void method826(@OriginalArg(0) int arg0) {
		super.aByteArray6[super.anInt1312++] = (byte) (this.aClass55_1.method1246() + arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B[I)V")
	public void method827(@OriginalArg(1) int[] arg0) {
		this.aClass55_1 = new Class55(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "(I)V")
	public void method828() {
		super.anInt1312 = (this.anInt1349 + 7) / 8;
	}

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "(I)I")
	public int method831() {
		return super.aByteArray6[super.anInt1312++] - this.aClass55_1.method1246() & 0xFF;
	}

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "(B)V")
	public void method832() {
		this.anInt1349 = super.anInt1312 * 8;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(ZI)I")
	public int method833(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt1349 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt1349 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt1349 += arg0;
		while (local18 < arg0) {
			local20 += (Static75.anIntArray128[local18] & super.aByteArray6[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local20 += Static75.anIntArray128[local18] & super.aByteArray6[local10];
		} else {
			local20 += super.aByteArray6[local10] >> local18 - arg0 & Static75.anIntArray128[arg0];
		}
		return local20;
	}
}
