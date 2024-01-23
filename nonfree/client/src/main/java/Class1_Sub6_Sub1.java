import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class1_Sub6_Sub1 extends Class1_Sub6 {

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "Z")
	public boolean aBoolean142;

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
	public int anInt3211;

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
	public int anInt3210;

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
	public int anInt3209;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3211 = arg0;
		this.aByteArray32 = arg1;
		this.anInt3210 = arg2;
		this.anInt3209 = arg3;
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3211 = arg0;
		this.aByteArray32 = arg1;
		this.anInt3210 = arg2;
		this.anInt3209 = arg3;
		this.aBoolean142 = arg4;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!ch;)Lclient!oh;")
	public Class1_Sub6_Sub1 method2536(@OriginalArg(0) Class23 arg0) {
		this.aByteArray32 = arg0.method528(this.aByteArray32);
		this.anInt3211 = arg0.method532(this.anInt3211);
		if (this.anInt3210 == this.anInt3209) {
			this.anInt3210 = this.anInt3209 = arg0.method529(this.anInt3210);
		} else {
			this.anInt3210 = arg0.method529(this.anInt3210);
			this.anInt3209 = arg0.method529(this.anInt3209);
			if (this.anInt3210 == this.anInt3209) {
				this.anInt3210--;
			}
		}
		return this;
	}
}
