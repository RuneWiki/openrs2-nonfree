import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class258 {

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "[B")
	public static final byte[] aByteArray69;

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "Lclient!lda;")
	private Class3_Sub6 aClass3_Sub6_45;

	@OriginalMember(owner = "client!oaa", name = "i", descriptor = "Lclient!lda;")
	public final Class3_Sub6 aClass3_Sub6_44 = new Class3_Sub6();

	static {
		@Pc(1) int local1 = 0;
		aByteArray69 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray69[local1++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "()V")
	public Class258() {
		this.aClass3_Sub6_44.aClass3_Sub6_66 = this.aClass3_Sub6_44;
		this.aClass3_Sub6_44.aClass3_Sub6_67 = this.aClass3_Sub6_44;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Lclient!lda;")
	public Class3_Sub6 method5929() {
		@Pc(6) Class3_Sub6 local6 = this.aClass3_Sub6_45;
		if (local6 == this.aClass3_Sub6_44) {
			this.aClass3_Sub6_45 = null;
			return null;
		} else {
			this.aClass3_Sub6_45 = local6.aClass3_Sub6_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)Lclient!lda;")
	public Class3_Sub6 method5931() {
		@Pc(12) Class3_Sub6 local12 = this.aClass3_Sub6_44.aClass3_Sub6_67;
		if (this.aClass3_Sub6_44 == local12) {
			return null;
		} else {
			local12.method8342();
			return local12;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(B)I")
	public int method5932() {
		@Pc(5) int local5 = 0;
		for (@Pc(9) Class3_Sub6 local9 = this.aClass3_Sub6_44.aClass3_Sub6_67; local9 != this.aClass3_Sub6_44; local9 = local9.aClass3_Sub6_67) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V")
	public void method5933() {
		while (true) {
			@Pc(15) Class3_Sub6 local15 = this.aClass3_Sub6_44.aClass3_Sub6_67;
			if (local15 == this.aClass3_Sub6_44) {
				this.aClass3_Sub6_45 = null;
				return;
			}
			local15.method8342();
		}
	}

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)Lclient!lda;")
	public Class3_Sub6 method5934() {
		@Pc(7) Class3_Sub6 local7 = this.aClass3_Sub6_44.aClass3_Sub6_67;
		if (local7 == this.aClass3_Sub6_44) {
			this.aClass3_Sub6_45 = null;
			return null;
		} else {
			this.aClass3_Sub6_45 = local7.aClass3_Sub6_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BLclient!lda;)V")
	public void method5936(@OriginalArg(1) Class3_Sub6 arg0) {
		if (arg0.aClass3_Sub6_66 != null) {
			arg0.method8342();
		}
		arg0.aClass3_Sub6_66 = this.aClass3_Sub6_44.aClass3_Sub6_66;
		arg0.aClass3_Sub6_67 = this.aClass3_Sub6_44;
		arg0.aClass3_Sub6_66.aClass3_Sub6_67 = arg0;
		arg0.aClass3_Sub6_67.aClass3_Sub6_66 = arg0;
	}
}
