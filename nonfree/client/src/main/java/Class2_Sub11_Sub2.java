import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class2_Sub11_Sub2 extends Class2_Sub11 {

	@OriginalMember(owner = "client!ua", name = "Lb", descriptor = "I")
	private int anInt10080;

	@OriginalMember(owner = "client!ua", name = "Nb", descriptor = "Lclient!ku;")
	private Class183 aClass183_2;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
	public Class2_Sub11_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "(I)Z")
	public boolean method8394() {
		@Pc(21) int local21 = super.aByteArray128[super.anInt10066] - this.aClass183_2.method5417() & 0xFF;
		return local21 >= 128;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[I)V")
	public void method8396(@OriginalArg(1) int[] arg0) {
		this.aClass183_2 = new Class183(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "(I)I")
	public int method8397() {
		@Pc(21) int local21 = super.aByteArray128[super.anInt10066++] - this.aClass183_2.method5420() & 0xFF;
		return local21 < 128 ? local21 : (super.aByteArray128[super.anInt10066++] - this.aClass183_2.method5420() & 0xFF) + (local21 - 128 << 8);
	}

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "(II)V")
	public void method8398(@OriginalArg(0) int arg0) {
		super.aByteArray128[super.anInt10066++] = (byte) (arg0 + this.aClass183_2.method5420());
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[BII)V")
	public void method8399(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray128[super.anInt10066++] - this.aClass183_2.method5420());
		}
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(BI)I")
	public int method8400(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = this.anInt10080 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt10080 & 0x7);
		this.anInt10080 += arg0;
		@Pc(31) int local31 = 0;
		while (local23 < arg0) {
			local31 += (super.aByteArray128[local15++] & Static36.anIntArray50[local23]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (local23 == arg0) {
			local31 += Static36.anIntArray50[local23] & super.aByteArray128[local15];
		} else {
			local31 += super.aByteArray128[local15] >> local23 - arg0 & Static36.anIntArray50[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
	public void method8402() {
		super.anInt10066 = (this.anInt10080 + 7) / 8;
	}

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "(II)I")
	public int method8405(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt10080;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!ku;)V")
	public void method8406(@OriginalArg(1) Class183 arg0) {
		this.aClass183_2 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "(I)V")
	public void method8407() {
		this.anInt10080 = super.anInt10066 * 8;
	}
}
