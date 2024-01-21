import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class4_Sub6_Sub1 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ke", name = "C", descriptor = "Z")
	public boolean aBoolean93;

	@OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
	public int anInt1657;

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
	public int anInt1656;

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
	public int anInt1655;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1657 = arg0;
		this.aByteArray13 = arg1;
		this.anInt1656 = arg2;
		this.anInt1655 = arg3;
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1657 = arg0;
		this.aByteArray13 = arg1;
		this.anInt1656 = arg2;
		this.anInt1655 = arg3;
		this.aBoolean93 = arg4;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!mc;)Lclient!ke;")
	public Class4_Sub6_Sub1 method1145(@OriginalArg(0) Class52 arg0) {
		this.aByteArray13 = arg0.method1211(this.aByteArray13);
		this.anInt1657 = arg0.method1210(this.anInt1657);
		if (this.anInt1656 == this.anInt1655) {
			this.anInt1656 = this.anInt1655 = arg0.method1217(this.anInt1656);
		} else {
			this.anInt1656 = arg0.method1217(this.anInt1656);
			this.anInt1655 = arg0.method1217(this.anInt1655);
			if (this.anInt1656 == this.anInt1655) {
				this.anInt1656--;
			}
		}
		return this;
	}
}
