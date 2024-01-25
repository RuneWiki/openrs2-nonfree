import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class58 {

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!sga;")
	private final Class307 aClass307_13 = new Class307(256);

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!sga;")
	private final Class307 aClass307_14 = new Class307(256);

	@OriginalMember(owner = "client!dd", name = "j", descriptor = "Lclient!kha;")
	private final Class181 aClass181_17;

	@OriginalMember(owner = "client!dd", name = "o", descriptor = "Lclient!kha;")
	private final Class181 aClass181_18;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!kha;Lclient!kha;)V")
	public Class58(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class181 arg1) {
		this.aClass181_17 = arg1;
		this.aClass181_18 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III[I)Lclient!ma;")
	private Class3_Sub12_Sub1 method2244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ (arg1 >>> 12 | arg1 << 4 & 0xFFF3);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class3_Sub12_Sub1 local31 = (Class3_Sub12_Sub1) this.aClass307_14.method7424(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(55) Class64 local55 = Static652.method2497(this.aClass181_18, arg1, arg0);
			if (local55 == null) {
				return null;
			}
			local31 = local55.method2494();
			this.aClass307_14.method7425(local24, local31);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray70.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[IZ)Lclient!ma;")
	public Class3_Sub12_Sub1 method2246(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass181_17.method5029() == 1) {
			return this.method2248(0, arg1, arg0);
		} else if (this.aClass181_17.method5025(arg0) == 1) {
			return this.method2248(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[III)Lclient!ma;")
	private Class3_Sub12_Sub1 method2248(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | arg0 << 4 & 0xFFF6) ^ arg2;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(31) long local31 = (long) local21 ^ 0x100000000L;
		@Pc(40) Class3_Sub12_Sub1 local40 = (Class3_Sub12_Sub1) this.aClass307_14.method7424(local31);
		if (local40 != null) {
			return local40;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(59) Class3_Sub47 local59 = (Class3_Sub47) this.aClass307_13.method7424(local31);
			if (local59 == null) {
				local59 = Static538.method7644(this.aClass181_17, arg0, arg2);
				if (local59 == null) {
					return null;
				}
				this.aClass307_13.method7425(local31, local59);
			}
			local40 = local59.method7648(arg1);
			if (local40 == null) {
				return null;
			} else {
				local59.method8671();
				this.aClass307_14.method7425(local31, local40);
				return local40;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[II)Lclient!ma;")
	public Class3_Sub12_Sub1 method2251(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass181_18.method5029() == 1) {
			return this.method2244(arg0, 0, arg1);
		} else if (this.aClass181_18.method5025(arg0) == 1) {
			return this.method2244(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
