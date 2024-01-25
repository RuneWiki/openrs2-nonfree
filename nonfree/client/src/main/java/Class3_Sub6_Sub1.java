import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class3_Sub6_Sub1 extends Class3_Sub6 {

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
	public int anInt1104;

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
	public int anInt1102;

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
	public int anInt1103;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1104 = arg0;
		this.aByteArray13 = arg1;
		this.anInt1102 = arg2;
		this.anInt1103 = arg3;
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1104 = arg0;
		this.aByteArray13 = arg1;
		this.anInt1102 = arg2;
		this.anInt1103 = arg3;
		this.aBoolean88 = arg4;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lclient!nba;)Lclient!bp;")
	public Class3_Sub6_Sub1 method1167(@OriginalArg(0) Class222 arg0) {
		this.aByteArray13 = arg0.method5813(this.aByteArray13);
		this.anInt1104 = arg0.method5811(this.anInt1104);
		if (this.anInt1102 == this.anInt1103) {
			this.anInt1102 = this.anInt1103 = arg0.method5808(this.anInt1102);
		} else {
			this.anInt1102 = arg0.method5808(this.anInt1102);
			this.anInt1103 = arg0.method5808(this.anInt1103);
			if (this.anInt1102 == this.anInt1103) {
				this.anInt1102--;
			}
		}
		return this;
	}
}
