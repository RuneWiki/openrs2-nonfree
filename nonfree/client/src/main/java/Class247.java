import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class247 {

	@OriginalMember(owner = "client!uv", name = "d", descriptor = "[I")
	public static final int[] anIntArray582 = new int[256];

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
	public int anInt6853;

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "Lclient!nj;")
	private final Class171 aClass171_54 = new Class171(64);

	@OriginalMember(owner = "client!uv", name = "n", descriptor = "Lclient!nj;")
	public final Class171 aClass171_55 = new Class171(30);

	@OriginalMember(owner = "client!uv", name = "c", descriptor = "Lclient!mg;")
	private final Class160 aClass160_78;

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "Lclient!mg;")
	public final Class160 aClass160_79;

	static {
		for (@Pc(9) int local9 = 0; local9 < 256; local9++) {
			@Pc(12) int local12 = local9;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1) == 1) {
					local12 = local12 >>> 1 ^ 0xEDB88320;
				} else {
					local12 >>>= 0x1;
				}
			}
			anIntArray582[local9] = local12;
		}
	}

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!al;ILclient!mg;Lclient!mg;)V")
	public Class247(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Class160 arg3) {
		this.aClass160_78 = arg2;
		this.aClass160_79 = arg3;
		@Pc(26) int local26 = this.aClass160_78.method3715() - 1;
		this.aClass160_78.method3722(local26);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
	public void method5403() {
		@Pc(6) Class171 local6 = this.aClass171_54;
		synchronized (this.aClass171_54) {
			this.aClass171_54.method3934();
		}
		local6 = this.aClass171_55;
		synchronized (this.aClass171_55) {
			this.aClass171_55.method3934();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(BI)V")
	public void method5405(@OriginalArg(1) int arg0) {
		this.anInt6853 = arg0;
		@Pc(15) Class171 local15 = this.aClass171_55;
		synchronized (this.aClass171_55) {
			this.aClass171_55.method3936();
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)Lclient!qi;")
	public Class203 method5407(@OriginalArg(0) int arg0) {
		@Pc(6) Class171 local6 = this.aClass171_54;
		@Pc(16) Class203 local16;
		synchronized (this.aClass171_54) {
			local16 = (Class203) this.aClass171_54.method3941((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) byte[] local37 = this.aClass160_78.method3696(Static227.method3553(arg0), Static43.method1873(arg0));
		local16 = new Class203();
		local16.aClass247_1 = this;
		local16.anInt5603 = arg0;
		if (local37 != null) {
			local16.method4529(new Class2_Sub23(local37));
		}
		@Pc(65) Class171 local65 = this.aClass171_54;
		synchronized (this.aClass171_54) {
			this.aClass171_54.method3940((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(II)V")
	public void method5408() {
		@Pc(2) Class171 local2 = this.aClass171_54;
		synchronized (this.aClass171_54) {
			this.aClass171_54.method3933(5);
		}
		local2 = this.aClass171_55;
		synchronized (this.aClass171_55) {
			this.aClass171_55.method3933(5);
		}
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
	public void method5410() {
		@Pc(6) Class171 local6 = this.aClass171_54;
		synchronized (this.aClass171_54) {
			this.aClass171_54.method3936();
		}
		local6 = this.aClass171_55;
		synchronized (this.aClass171_55) {
			this.aClass171_55.method3936();
		}
	}
}
