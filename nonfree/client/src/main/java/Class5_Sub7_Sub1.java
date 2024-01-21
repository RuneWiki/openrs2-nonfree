import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class5_Sub7_Sub1 extends Class5_Sub7 {

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "Z")
	public boolean aBoolean118;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
	public int anInt2688;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
	public int anInt2689;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
	public int anInt2687;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I[BII)V")
	public Class5_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2688 = arg0;
		this.aByteArray42 = arg1;
		this.anInt2689 = arg2;
		this.anInt2687 = arg3;
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class5_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2688 = arg0;
		this.aByteArray42 = arg1;
		this.anInt2689 = arg2;
		this.anInt2687 = arg3;
		this.aBoolean118 = arg4;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!jg;)Lclient!ne;")
	public Class5_Sub7_Sub1 method2004(@OriginalArg(0) Class49 arg0) {
		this.aByteArray42 = arg0.method1509(this.aByteArray42);
		this.anInt2688 = arg0.method1504(this.anInt2688);
		if (this.anInt2689 == this.anInt2687) {
			this.anInt2689 = this.anInt2687 = arg0.method1508(this.anInt2689);
		} else {
			this.anInt2689 = arg0.method1508(this.anInt2689);
			this.anInt2687 = arg0.method1508(this.anInt2687);
			if (this.anInt2689 == this.anInt2687) {
				this.anInt2689--;
			}
		}
		return this;
	}
}
