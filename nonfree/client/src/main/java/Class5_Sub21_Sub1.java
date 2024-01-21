import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class5_Sub21_Sub1 extends Class5_Sub21 {

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "Z")
	public boolean aBoolean96;

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
	public int anInt2647;

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
	public int anInt2645;

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
	public int anInt2646;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I[BII)V")
	public Class5_Sub21_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2647 = arg0;
		this.aByteArray37 = arg1;
		this.anInt2645 = arg2;
		this.anInt2646 = arg3;
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class5_Sub21_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2647 = arg0;
		this.aByteArray37 = arg1;
		this.anInt2645 = arg2;
		this.anInt2646 = arg3;
		this.aBoolean96 = arg4;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!bc;)Lclient!qf;")
	public Class5_Sub21_Sub1 method1700(@OriginalArg(0) Class9 arg0) {
		this.aByteArray37 = arg0.method195(this.aByteArray37);
		this.anInt2647 = arg0.method194(this.anInt2647);
		if (this.anInt2645 == this.anInt2646) {
			this.anInt2645 = this.anInt2646 = arg0.method190(this.anInt2645);
		} else {
			this.anInt2645 = arg0.method190(this.anInt2645);
			this.anInt2646 = arg0.method190(this.anInt2646);
			if (this.anInt2645 == this.anInt2646) {
				this.anInt2645--;
			}
		}
		return this;
	}
}
