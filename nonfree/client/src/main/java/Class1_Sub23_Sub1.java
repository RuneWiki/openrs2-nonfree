import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class1_Sub23_Sub1 extends Class1_Sub23 {

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Z")
	public boolean aBoolean355;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt4002;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "[B")
	public byte[] aByteArray133;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
	public int anInt4003;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt4001;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub23_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4002 = arg0;
		this.aByteArray133 = arg1;
		this.anInt4003 = arg2;
		this.anInt4001 = arg3;
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub23_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4002 = arg0;
		this.aByteArray133 = arg1;
		this.anInt4003 = arg2;
		this.anInt4001 = arg3;
		this.aBoolean355 = arg4;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!fk;)Lclient!pc;")
	public Class1_Sub23_Sub1 method3466(@OriginalArg(0) Class55 arg0) {
		this.aByteArray133 = arg0.method1612(this.aByteArray133);
		this.anInt4002 = arg0.method1610(this.anInt4002);
		if (this.anInt4003 == this.anInt4001) {
			this.anInt4003 = this.anInt4001 = arg0.method1615(this.anInt4003);
		} else {
			this.anInt4003 = arg0.method1615(this.anInt4003);
			this.anInt4001 = arg0.method1615(this.anInt4001);
			if (this.anInt4003 == this.anInt4001) {
				this.anInt4003--;
			}
		}
		return this;
	}
}
