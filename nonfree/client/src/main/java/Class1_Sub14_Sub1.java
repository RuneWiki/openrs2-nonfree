import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public final class Class1_Sub14_Sub1 extends Class1_Sub14 {

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "Z")
	public boolean aBoolean99;

	@OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
	public int anInt2051;

	@OriginalMember(owner = "client!pa", name = "A", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
	public int anInt2052;

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
	public int anInt2050;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2051 = arg0;
		this.aByteArray21 = arg1;
		this.anInt2052 = arg2;
		this.anInt2050 = arg3;
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2051 = arg0;
		this.aByteArray21 = arg1;
		this.anInt2052 = arg2;
		this.anInt2050 = arg3;
		this.aBoolean99 = arg4;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lclient!nd;)Lclient!pa;")
	public Class1_Sub14_Sub1 method1538(@OriginalArg(0) Class58 arg0) {
		this.aByteArray21 = arg0.method1382(this.aByteArray21);
		this.anInt2051 = arg0.method1380(this.anInt2051);
		if (this.anInt2052 == this.anInt2050) {
			this.anInt2052 = this.anInt2050 = arg0.method1384(this.anInt2052);
		} else {
			this.anInt2052 = arg0.method1384(this.anInt2052);
			this.anInt2050 = arg0.method1384(this.anInt2050);
			if (this.anInt2052 == this.anInt2050) {
				this.anInt2052--;
			}
		}
		return this;
	}
}
