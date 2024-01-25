import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class5_Sub11_Sub1 extends Class5_Sub11 {

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "Z")
	public boolean aBoolean106;

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
	public int anInt1318;

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
	public int anInt1320;

	@OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
	public int anInt1319;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(I[BII)V")
	public Class5_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1318 = arg0;
		this.aByteArray17 = arg1;
		this.anInt1320 = arg2;
		this.anInt1319 = arg3;
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class5_Sub11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1318 = arg0;
		this.aByteArray17 = arg1;
		this.anInt1320 = arg2;
		this.anInt1319 = arg3;
		this.aBoolean106 = arg4;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!tf;)Lclient!ct;")
	public Class5_Sub11_Sub1 method1276(@OriginalArg(0) Class325 arg0) {
		this.aByteArray17 = arg0.method7730(this.aByteArray17);
		this.anInt1318 = arg0.method7728(this.anInt1318);
		if (this.anInt1320 == this.anInt1319) {
			this.anInt1320 = this.anInt1319 = arg0.method7729(this.anInt1320);
		} else {
			this.anInt1320 = arg0.method7729(this.anInt1320);
			this.anInt1319 = arg0.method7729(this.anInt1319);
			if (this.anInt1320 == this.anInt1319) {
				this.anInt1320--;
			}
		}
		return this;
	}
}
