import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "Z")
	public boolean aBoolean27;

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
	public int anInt312;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
	public int anInt310;

	@OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
	public int anInt311;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt312 = arg0;
		this.aByteArray6 = arg1;
		this.anInt310 = arg2;
		this.anInt311 = arg3;
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt312 = arg0;
		this.aByteArray6 = arg1;
		this.anInt310 = arg2;
		this.anInt311 = arg3;
		this.aBoolean27 = arg4;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!k;)Lclient!ai;")
	public Class1_Sub4_Sub1 method319(@OriginalArg(0) Class43 arg0) {
		this.aByteArray6 = arg0.method1826(this.aByteArray6);
		this.anInt312 = arg0.method1825(this.anInt312);
		if (this.anInt310 == this.anInt311) {
			this.anInt310 = this.anInt311 = arg0.method1823(this.anInt310);
		} else {
			this.anInt310 = arg0.method1823(this.anInt310);
			this.anInt311 = arg0.method1823(this.anInt311);
			if (this.anInt310 == this.anInt311) {
				this.anInt310--;
			}
		}
		return this;
	}
}
