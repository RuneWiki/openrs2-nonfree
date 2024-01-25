import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class3_Sub3_Sub15 extends Class3_Sub3 {

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "[Lclient!eg;")
	public Class76[] aClass76Array1;

	@OriginalMember(owner = "client!rc", name = "C", descriptor = "[[B")
	private byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
	private final int anInt7353;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V")
	public Class3_Sub3_Sub15(@OriginalArg(0) int arg0) {
		this.anInt7353 = arg0;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
	public boolean method6248(@OriginalArg(1) int arg0) {
		return this.aClass76Array1[arg0].aBoolean217;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Z")
	public boolean method6249() {
		if (this.aClass76Array1 != null) {
			return true;
		}
		@Pc(37) int[] local37;
		@Pc(44) int local44;
		if (this.aByteArrayArray24 == null) {
			@Pc(15) Class246 local15 = Static139.aClass246_72;
			synchronized (Static139.aClass246_72) {
				if (!Static139.aClass246_72.method5658(this.anInt7353)) {
					return false;
				}
				local37 = Static139.aClass246_72.method5668(this.anInt7353);
				this.aByteArrayArray24 = new byte[local37.length][];
				for (local44 = 0; local44 < local37.length; local44++) {
					this.aByteArrayArray24[local44] = Static139.aClass246_72.method5653(this.anInt7353, local37[local44]);
				}
			}
		}
		@Pc(71) boolean local71 = true;
		for (@Pc(73) int local73 = 0; local73 < this.aByteArrayArray24.length; local73++) {
			@Pc(80) byte[] local80 = this.aByteArrayArray24[local73];
			@Pc(85) Class3_Sub11 local85 = new Class3_Sub11(local80);
			local85.anInt3520 = 1;
			local44 = local85.method3109();
			@Pc(94) Class246 local94 = Static352.aClass246_122;
			synchronized (Static352.aClass246_122) {
				local71 &= Static352.aClass246_122.method5667(local44);
			}
		}
		if (!local71) {
			return false;
		}
		@Pc(128) Class130 local128 = new Class130();
		@Pc(130) Class246 local130 = Static139.aClass246_72;
		synchronized (Static139.aClass246_72) {
			@Pc(140) int local140 = Static139.aClass246_72.method5673(this.anInt7353);
			this.aClass76Array1 = new Class76[local140];
			local37 = Static139.aClass246_72.method5668(this.anInt7353);
		}
		for (local44 = 0; local44 < local37.length; local44++) {
			@Pc(165) byte[] local165 = this.aByteArrayArray24[local44];
			@Pc(170) Class3_Sub11 local170 = new Class3_Sub11(local165);
			local170.anInt3520 = 1;
			@Pc(177) int local177 = local170.method3109();
			@Pc(179) Class3_Sub14 local179 = null;
			for (@Pc(186) Class3_Sub14 local186 = (Class3_Sub14) local128.method3543(); local186 != null; local186 = (Class3_Sub14) local128.method3551()) {
				if (local177 == local186.anInt1983) {
					local179 = local186;
					break;
				}
			}
			if (local179 == null) {
				@Pc(208) Class246 local208 = Static352.aClass246_122;
				synchronized (Static352.aClass246_122) {
					local179 = new Class3_Sub14(local177, Static352.aClass246_122.method5679(local177));
				}
				local128.method3548(local179);
			}
			this.aClass76Array1[local37[local44]] = new Class76(local165, local179);
		}
		this.aByteArrayArray24 = null;
		return true;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)Z")
	public boolean method6250(@OriginalArg(0) int arg0) {
		return this.aClass76Array1[arg0].aBoolean216;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)Z")
	public boolean method6254(@OriginalArg(0) int arg0) {
		return this.aClass76Array1[arg0].aBoolean215;
	}
}
