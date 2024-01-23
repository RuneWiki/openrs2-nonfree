import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "Z")
	public boolean aBoolean266;

	@OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
	public int anInt4839;

	@OriginalMember(owner = "client!qj", name = "x", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
	public int anInt4841;

	@OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
	public int anInt4840;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4839 = arg0;
		this.aByteArray65 = arg1;
		this.anInt4841 = arg2;
		this.anInt4840 = arg3;
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4839 = arg0;
		this.aByteArray65 = arg1;
		this.anInt4841 = arg2;
		this.anInt4840 = arg3;
		this.aBoolean266 = arg4;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ra;)Lclient!qj;")
	public Class1_Sub4_Sub1 method3838(@OriginalArg(0) Class135 arg0) {
		this.aByteArray65 = arg0.method3914(this.aByteArray65);
		this.anInt4839 = arg0.method3916(this.anInt4839);
		if (this.anInt4841 == this.anInt4840) {
			this.anInt4841 = this.anInt4840 = arg0.method3913(this.anInt4841);
		} else {
			this.anInt4841 = arg0.method3913(this.anInt4841);
			this.anInt4840 = arg0.method3913(this.anInt4840);
			if (this.anInt4841 == this.anInt4840) {
				this.anInt4841--;
			}
		}
		return this;
	}
}
