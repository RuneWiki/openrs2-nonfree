import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class1_Sub7_Sub1 extends Class1_Sub7 {

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "Z")
	public boolean aBoolean113;

	@OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
	public int anInt1313;

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
	public int anInt1312;

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
	public int anInt1314;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1313 = arg0;
		this.aByteArray24 = arg1;
		this.anInt1312 = arg2;
		this.anInt1314 = arg3;
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1313 = arg0;
		this.aByteArray24 = arg1;
		this.anInt1312 = arg2;
		this.anInt1314 = arg3;
		this.aBoolean113 = arg4;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!sd;)Lclient!ee;")
	public Class1_Sub7_Sub1 method1034(@OriginalArg(0) Class108 arg0) {
		this.aByteArray24 = arg0.method3121(this.aByteArray24);
		this.anInt1313 = arg0.method3119(this.anInt1313);
		if (this.anInt1312 == this.anInt1314) {
			this.anInt1312 = this.anInt1314 = arg0.method3124(this.anInt1312);
		} else {
			this.anInt1312 = arg0.method3124(this.anInt1312);
			this.anInt1314 = arg0.method3124(this.anInt1314);
			if (this.anInt1312 == this.anInt1314) {
				this.anInt1312--;
			}
		}
		return this;
	}
}
