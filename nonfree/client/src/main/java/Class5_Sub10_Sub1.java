import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class5_Sub10_Sub1 extends Class5_Sub10 {

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "Z")
	public boolean aBoolean77;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
	public int anInt1039;

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
	public int anInt1040;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
	public int anInt1041;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I[BII)V")
	public Class5_Sub10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1039 = arg0;
		this.aByteArray9 = arg1;
		this.anInt1040 = arg2;
		this.anInt1041 = arg3;
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class5_Sub10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1039 = arg0;
		this.aByteArray9 = arg1;
		this.anInt1040 = arg2;
		this.anInt1041 = arg3;
		this.aBoolean77 = arg4;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!jh;)Lclient!dg;")
	public Class5_Sub10_Sub1 method896(@OriginalArg(0) Class101 arg0) {
		this.aByteArray9 = arg0.method2708(this.aByteArray9);
		this.anInt1039 = arg0.method2707(this.anInt1039);
		if (this.anInt1040 == this.anInt1041) {
			this.anInt1040 = this.anInt1041 = arg0.method2706(this.anInt1040);
		} else {
			this.anInt1040 = arg0.method2706(this.anInt1040);
			this.anInt1041 = arg0.method2706(this.anInt1041);
			if (this.anInt1040 == this.anInt1041) {
				this.anInt1040--;
			}
		}
		return this;
	}
}
