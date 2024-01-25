import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tia")
public final class Class5_Sub41_Sub2 extends Class5_Sub41 {

	@OriginalMember(owner = "client!tia", name = "Ob", descriptor = "Lclient!bw;")
	private Class49 aClass49_2;

	@OriginalMember(owner = "client!tia", name = "Xb", descriptor = "I")
	private int anInt9307;

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(I)V")
	public Class5_Sub41_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tia", name = "l", descriptor = "(B)Z")
	public boolean method7865() {
		@Pc(24) int local24 = super.aByteArray93[super.anInt9230] - this.aClass49_2.method829() & 0xFF;
		return local24 >= 128;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(I[I)V")
	public void method7866(@OriginalArg(1) int[] arg0) {
		this.aClass49_2 = new Class49(arg0);
	}

	@OriginalMember(owner = "client!tia", name = "z", descriptor = "(I)I")
	public int method7868() {
		@Pc(30) int local30 = super.aByteArray93[super.anInt9230++] - this.aClass49_2.method825() & 0xFF;
		return local30 < 128 ? local30 : (local30 - 128 << 8) + (super.aByteArray93[super.anInt9230++] - this.aClass49_2.method825() & 0xFF);
	}

	@OriginalMember(owner = "client!tia", name = "m", descriptor = "(B)V")
	public void method7869() {
		this.anInt9307 = super.anInt9230 * 8;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Lclient!bw;B)V")
	public void method7870(@OriginalArg(0) Class49 arg0) {
		this.aClass49_2 = arg0;
	}

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(ZI)I")
	public int method7871(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = this.anInt9307 >> 3;
		@Pc(21) int local21 = 8 - (this.anInt9307 & 0x7);
		@Pc(23) int local23 = 0;
		this.anInt9307 += arg0;
		while (arg0 > local21) {
			local23 += (Static388.anIntArray391[local21] & super.aByteArray93[local13++]) << arg0 - local21;
			arg0 -= local21;
			local21 = 8;
		}
		if (arg0 == local21) {
			local23 += Static388.anIntArray391[local21] & super.aByteArray93[local13];
		} else {
			local23 += super.aByteArray93[local13] >> local21 - arg0 & Static388.anIntArray391[arg0];
		}
		return local23;
	}

	@OriginalMember(owner = "client!tia", name = "p", descriptor = "(II)V")
	public void method7875(@OriginalArg(0) int arg0) {
		super.aByteArray93[super.anInt9230++] = (byte) (arg0 + this.aClass49_2.method825());
	}

	@OriginalMember(owner = "client!tia", name = "q", descriptor = "(II)I")
	public int method7876(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt9307;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(I[BII)V")
	public void method7877(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (super.aByteArray93[super.anInt9230++] - this.aClass49_2.method825());
		}
	}

	@OriginalMember(owner = "client!tia", name = "e", descriptor = "(Z)V")
	public void method7878() {
		super.anInt9230 = (this.anInt9307 + 7) / 8;
	}
}
