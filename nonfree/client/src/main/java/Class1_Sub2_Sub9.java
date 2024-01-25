import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ir", name = "v", descriptor = "[Lclient!rq;")
	public Class214[] aClass214Array1;

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "[[B")
	private byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
	private final int anInt3222;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(I)V")
	public Class1_Sub2_Sub9(@OriginalArg(0) int arg0) {
		this.anInt3222 = arg0;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)Z")
	public boolean method2798(@OriginalArg(1) int arg0) {
		return this.aClass214Array1[arg0].aBoolean409;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)Z")
	public boolean method2799(@OriginalArg(0) int arg0) {
		return this.aClass214Array1[arg0].aBoolean410;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(II)Z")
	public boolean method2800(@OriginalArg(1) int arg0) {
		return this.aClass214Array1[arg0].aBoolean408;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)Z")
	public boolean method2801() {
		if (this.aClass214Array1 != null) {
			return true;
		}
		@Pc(32) int local32;
		if (this.aByteArrayArray7 == null) {
			if (!Static280.aClass246_157.method5489(this.anInt3222)) {
				return false;
			}
			@Pc(25) int[] local25 = Static280.aClass246_157.method5481(this.anInt3222);
			this.aByteArrayArray7 = new byte[local25.length][];
			for (local32 = 0; local32 < local25.length; local32++) {
				this.aByteArrayArray7[local32] = Static280.aClass246_157.method5477(this.anInt3222, local25[local32]);
			}
		}
		@Pc(56) boolean local56 = true;
		@Pc(78) int local78;
		for (local32 = 0; local32 < this.aByteArrayArray7.length; local32++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray7[local32];
			local78 = local64[1] & 0xFF | (local64[0] & 0xFF) << 8;
			local56 &= Static333.aClass246_177.method5497(local78);
		}
		if (!local56) {
			return false;
		}
		@Pc(104) Class181 local104 = new Class181();
		local78 = Static280.aClass246_157.method5492(this.anInt3222);
		this.aClass214Array1 = new Class214[local78];
		@Pc(120) int[] local120 = Static280.aClass246_157.method5481(this.anInt3222);
		for (@Pc(122) int local122 = 0; local122 < local120.length; local122++) {
			@Pc(128) byte[] local128 = this.aByteArrayArray7[local122];
			@Pc(142) int local142 = (local128[0] & 0xFF) << 8 | local128[1] & 0xFF;
			@Pc(144) Class1_Sub32 local144 = null;
			for (@Pc(149) Class1_Sub32 local149 = (Class1_Sub32) local104.method4112(); local149 != null; local149 = (Class1_Sub32) local104.method4104()) {
				if (local142 == local149.anInt4840) {
					local144 = local149;
					break;
				}
			}
			if (local144 == null) {
				local144 = new Class1_Sub32(local142, Static333.aClass246_177.method5499(local142));
				local104.method4102(local144);
			}
			this.aClass214Array1[local120[local122]] = new Class214(local128, local144);
		}
		this.aByteArrayArray7 = null;
		return true;
	}
}
