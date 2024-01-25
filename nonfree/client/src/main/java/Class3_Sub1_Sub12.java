import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kga", name = "t", descriptor = "[F")
	public static final float[] aFloatArray51 = new float[16384];

	@OriginalMember(owner = "client!kga", name = "E", descriptor = "[F")
	public static final float[] aFloatArray52 = new float[16384];

	@OriginalMember(owner = "client!kga", name = "x", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!kga", name = "y", descriptor = "[Lclient!hl;")
	public Class133[] aClass133Array1;

	@OriginalMember(owner = "client!kga", name = "A", descriptor = "I")
	private final int anInt5924;

	static {
		@Pc(28) double local28 = 3.834951969714103E-4D;
		for (@Pc(30) int local30 = 0; local30 < 16384; local30++) {
			aFloatArray52[local30] = (float) Math.sin((double) local30 * local28);
			aFloatArray51[local30] = (float) Math.cos(local28 * (double) local30);
		}
	}

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(I)V")
	public Class3_Sub1_Sub12(@OriginalArg(0) int arg0) {
		this.anInt5924 = arg0;
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(I)Z")
	public boolean method5014() {
		if (this.aClass133Array1 != null) {
			return true;
		}
		@Pc(37) int[] local37;
		@Pc(44) int local44;
		if (this.aByteArrayArray11 == null) {
			@Pc(15) Class181 local15 = Static201.aClass181_43;
			synchronized (Static201.aClass181_43) {
				if (!Static201.aClass181_43.method5031(this.anInt5924)) {
					return false;
				}
				local37 = Static201.aClass181_43.method5030(this.anInt5924);
				this.aByteArrayArray11 = new byte[local37.length][];
				for (local44 = 0; local44 < local37.length; local44++) {
					this.aByteArrayArray11[local44] = Static201.aClass181_43.method5023(this.anInt5924, local37[local44]);
				}
			}
		}
		@Pc(77) boolean local77 = true;
		for (@Pc(79) int local79 = 0; local79 < this.aByteArrayArray11.length; local79++) {
			@Pc(86) byte[] local86 = this.aByteArrayArray11[local79];
			@Pc(91) Class3_Sub15 local91 = new Class3_Sub15(local86);
			local91.anInt10282 = 1;
			local44 = local91.method8414();
			@Pc(100) Class181 local100 = Static438.aClass181_82;
			synchronized (Static438.aClass181_82) {
				local77 &= Static438.aClass181_82.method5040(local44);
			}
		}
		if (!local77) {
			return false;
		}
		@Pc(129) Class276 local129 = new Class276();
		@Pc(131) Class181 local131 = Static201.aClass181_43;
		synchronized (Static201.aClass181_43) {
			@Pc(139) int local139 = Static201.aClass181_43.method5025(this.anInt5924);
			this.aClass133Array1 = new Class133[local139];
			local37 = Static201.aClass181_43.method5030(this.anInt5924);
		}
		for (local44 = 0; local44 < local37.length; local44++) {
			@Pc(172) byte[] local172 = this.aByteArrayArray11[local44];
			@Pc(177) Class3_Sub15 local177 = new Class3_Sub15(local172);
			local177.anInt10282 = 1;
			@Pc(184) int local184 = local177.method8414();
			@Pc(186) Class3_Sub45 local186 = null;
			for (@Pc(191) Class3_Sub45 local191 = (Class3_Sub45) local129.method6907(); local191 != null; local191 = (Class3_Sub45) local129.method6912()) {
				if (local191.anInt9096 == local184) {
					local186 = local191;
					break;
				}
			}
			if (local186 == null) {
				@Pc(215) Class181 local215 = Static438.aClass181_82;
				synchronized (Static438.aClass181_82) {
					local186 = new Class3_Sub45(local184, Static438.aClass181_82.method5049(local184));
				}
				local129.method6906(local186);
			}
			this.aClass133Array1[local37[local44]] = new Class133(local172, local186);
		}
		this.aByteArrayArray11 = null;
		return true;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IB)Z")
	public boolean method5015(@OriginalArg(0) int arg0) {
		return this.aClass133Array1[arg0].aBoolean432;
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(IB)Z")
	public boolean method5016(@OriginalArg(0) int arg0) {
		return this.aClass133Array1[arg0].aBoolean430;
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(II)Z")
	public boolean method5017(@OriginalArg(1) int arg0) {
		return this.aClass133Array1[arg0].aBoolean431;
	}
}
