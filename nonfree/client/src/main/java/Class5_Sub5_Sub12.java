import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class5_Sub5_Sub12 extends Class5_Sub5 {

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "[Lclient!th;")
	public Class332[] aClass332Array1;

	@OriginalMember(owner = "client!lk", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
	private final int anInt5402;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V")
	public Class5_Sub5_Sub12(@OriginalArg(0) int arg0) {
		this.anInt5402 = arg0;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Z")
	public boolean method4847() {
		if (this.aClass332Array1 != null) {
			return true;
		}
		@Pc(35) int[] local35;
		@Pc(42) int local42;
		if (this.aByteArrayArray14 == null) {
			@Pc(15) Class207 local15 = Static427.aClass207_85;
			synchronized (Static427.aClass207_85) {
				if (!Static427.aClass207_85.method4664(this.anInt5402)) {
					return false;
				}
				local35 = Static427.aClass207_85.method4676(this.anInt5402);
				this.aByteArrayArray14 = new byte[local35.length][];
				for (local42 = 0; local42 < local35.length; local42++) {
					this.aByteArrayArray14[local42] = Static427.aClass207_85.method4681(this.anInt5402, local35[local42]);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray14.length; local71++) {
			@Pc(78) byte[] local78 = this.aByteArrayArray14[local71];
			@Pc(83) Class5_Sub22 local83 = new Class5_Sub22(local78);
			local83.anInt6629 = 1;
			local42 = local83.method5968();
			@Pc(92) Class207 local92 = Static561.aClass207_118;
			synchronized (Static561.aClass207_118) {
				local69 &= Static561.aClass207_118.method4678(local42);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(121) Class330 local121 = new Class330();
		@Pc(123) Class207 local123 = Static427.aClass207_85;
		synchronized (Static427.aClass207_85) {
			@Pc(131) int local131 = Static427.aClass207_85.method4672(this.anInt5402);
			this.aClass332Array1 = new Class332[local131];
			local35 = Static427.aClass207_85.method4676(this.anInt5402);
		}
		for (@Pc(157) int local157 = 0; local157 < local35.length; local157++) {
			@Pc(164) byte[] local164 = this.aByteArrayArray14[local157];
			@Pc(169) Class5_Sub22 local169 = new Class5_Sub22(local164);
			local169.anInt6629 = 1;
			@Pc(176) int local176 = local169.method5968();
			@Pc(178) Class5_Sub16 local178 = null;
			for (@Pc(183) Class5_Sub16 local183 = (Class5_Sub16) local121.method7908(); local183 != null; local183 = (Class5_Sub16) local121.method7914()) {
				if (local183.anInt1894 == local176) {
					local178 = local183;
					break;
				}
			}
			if (local178 == null) {
				@Pc(207) Class207 local207 = Static561.aClass207_118;
				synchronized (Static561.aClass207_118) {
					local178 = new Class5_Sub16(local176, Static561.aClass207_118.method4690(local176));
				}
				local121.method7917(local178);
			}
			this.aClass332Array1[local35[local157]] = new Class332(local164, local178);
		}
		this.aByteArrayArray14 = null;
		return true;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(II)Z")
	public boolean method4848(@OriginalArg(0) int arg0) {
		return this.aClass332Array1[arg0].aBoolean667;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(II)Z")
	public boolean method4850(@OriginalArg(0) int arg0) {
		return this.aClass332Array1[arg0].aBoolean666;
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(II)Z")
	public boolean method4852(@OriginalArg(1) int arg0) {
		return this.aClass332Array1[arg0].aBoolean668;
	}
}
