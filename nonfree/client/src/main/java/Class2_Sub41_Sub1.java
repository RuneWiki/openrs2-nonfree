import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class Class2_Sub41_Sub1 extends Class2_Sub41 {

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "Z")
	public boolean aBoolean601;

	@OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
	public int anInt7101;

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "[B")
	public byte[] aByteArray195;

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
	public int anInt7099;

	@OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
	public int anInt7100;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub41_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7101 = arg0;
		this.aByteArray195 = arg1;
		this.anInt7099 = arg2;
		this.anInt7100 = arg3;
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub41_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7101 = arg0;
		this.aByteArray195 = arg1;
		this.anInt7099 = arg2;
		this.anInt7100 = arg3;
		this.aBoolean601 = arg4;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!pr;)Lclient!uo;")
	public Class2_Sub41_Sub1 method5546(@OriginalArg(0) Class195 arg0) {
		this.aByteArray195 = arg0.method4384(this.aByteArray195);
		this.anInt7101 = arg0.method4379(this.anInt7101);
		if (this.anInt7099 == this.anInt7100) {
			this.anInt7099 = this.anInt7100 = arg0.method4383(this.anInt7099);
		} else {
			this.anInt7099 = arg0.method4383(this.anInt7099);
			this.anInt7100 = arg0.method4383(this.anInt7100);
			if (this.anInt7099 == this.anInt7100) {
				this.anInt7099--;
			}
		}
		return this;
	}
}
