import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class4_Sub13_Sub1 extends Class4_Sub13 {

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "Z")
	public boolean aBoolean132;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
	public int anInt1367;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
	public int anInt1365;

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
	public int anInt1366;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I[BII)V")
	public Class4_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1367 = arg0;
		this.aByteArray12 = arg1;
		this.anInt1365 = arg2;
		this.anInt1366 = arg3;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class4_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1367 = arg0;
		this.aByteArray12 = arg1;
		this.anInt1365 = arg2;
		this.anInt1366 = arg3;
		this.aBoolean132 = arg4;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!ed;)Lclient!ib;")
	public Class4_Sub13_Sub1 method935(@OriginalArg(0) Class23 arg0) {
		this.aByteArray12 = arg0.method489(this.aByteArray12);
		this.anInt1367 = arg0.method491(this.anInt1367);
		if (this.anInt1365 == this.anInt1366) {
			this.anInt1365 = this.anInt1366 = arg0.method493(this.anInt1365);
		} else {
			this.anInt1365 = arg0.method493(this.anInt1365);
			this.anInt1366 = arg0.method493(this.anInt1366);
			if (this.anInt1365 == this.anInt1366) {
				this.anInt1365--;
			}
		}
		return this;
	}
}
