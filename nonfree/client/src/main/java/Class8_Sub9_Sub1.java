import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class8_Sub9_Sub1 extends Class8_Sub9 {

	@OriginalMember(owner = "client!p", name = "u", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!p", name = "v", descriptor = "I")
	public int anInt2236;

	@OriginalMember(owner = "client!p", name = "w", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!p", name = "t", descriptor = "I")
	public int anInt2235;

	@OriginalMember(owner = "client!p", name = "x", descriptor = "I")
	public int anInt2237;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(I[BII)V")
	public Class8_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2236 = arg0;
		this.aByteArray37 = arg1;
		this.anInt2235 = arg2;
		this.anInt2237 = arg3;
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class8_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2236 = arg0;
		this.aByteArray37 = arg1;
		this.anInt2235 = arg2;
		this.anInt2237 = arg3;
		this.aBoolean88 = arg4;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!mb;)Lclient!p;")
	public Class8_Sub9_Sub1 method1343(@OriginalArg(0) Class51 arg0) {
		this.aByteArray37 = arg0.method1124(this.aByteArray37);
		this.anInt2236 = arg0.method1126(this.anInt2236);
		if (this.anInt2235 == this.anInt2237) {
			this.anInt2235 = this.anInt2237 = arg0.method1127(this.anInt2235);
		} else {
			this.anInt2235 = arg0.method1127(this.anInt2235);
			this.anInt2237 = arg0.method1127(this.anInt2237);
			if (this.anInt2235 == this.anInt2237) {
				this.anInt2235--;
			}
		}
		return this;
	}
}
