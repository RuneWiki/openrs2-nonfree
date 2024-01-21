import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class1_Sub9_Sub1 extends Class1_Sub9 {

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "Z")
	public boolean aBoolean196;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
	public int anInt4138;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
	public int anInt4140;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
	public int anInt4139;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4138 = arg0;
		this.aByteArray53 = arg1;
		this.anInt4140 = arg2;
		this.anInt4139 = arg3;
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4138 = arg0;
		this.aByteArray53 = arg1;
		this.anInt4140 = arg2;
		this.anInt4139 = arg3;
		this.aBoolean196 = arg4;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ad;)Lclient!ti;")
	public Class1_Sub9_Sub1 method3204(@OriginalArg(0) Class4 arg0) {
		this.aByteArray53 = arg0.method107(this.aByteArray53);
		this.anInt4138 = arg0.method105(this.anInt4138);
		if (this.anInt4140 == this.anInt4139) {
			this.anInt4140 = this.anInt4139 = arg0.method102(this.anInt4140);
		} else {
			this.anInt4140 = arg0.method102(this.anInt4140);
			this.anInt4139 = arg0.method102(this.anInt4139);
			if (this.anInt4140 == this.anInt4139) {
				this.anInt4140--;
			}
		}
		return this;
	}
}
