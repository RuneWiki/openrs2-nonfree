import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class293 {

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "Lclient!nr;")
	public Class237 aClass237_4;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
	public int anInt8555;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
	public int anInt8556;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "Z")
	public boolean aBoolean607 = false;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!un;I)V")
	public void method6991(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4905();
			if (local5 == 0) {
				return;
			}
			this.method6994(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Z")
	public boolean method6992() {
		return this.aClass237_4.aClass176_92.method3996(this.anInt8556);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!r;ZI)Lclient!f;")
	public Class78 method6993(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(24) long local24 = (long) ((arg2 ? 262144 : 0) | this.anInt8556 | arg0 << 16 | arg1.anInt5872 << 19);
		@Pc(39) Class78 local39 = (Class78) this.aClass237_4.aClass223_46.method5388(local24);
		if (local39 != null) {
			return local39;
		} else if (this.aClass237_4.aClass176_92.method3996(this.anInt8556)) {
			@Pc(61) Class261 local61 = Static598.method6312(this.aClass237_4.aClass176_92, this.anInt8556, 0);
			if (local61 != null) {
				local61.anInt7659 = local61.anInt7657 = local61.anInt7658 = local61.anInt7656 = 0;
				if (arg2) {
					local61.method6324();
				}
				for (@Pc(81) int local81 = 0; local81 < arg0; local81++) {
					local61.method6322();
				}
			}
			local39 = arg1.method5018(local61, true);
			if (local39 != null) {
				this.aClass237_4.aClass223_46.method5394(local39, local24);
			}
			return local39;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!un;B)V")
	private void method6994(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt8556 = arg1.method4936();
		} else if (arg0 == 2) {
			this.anInt8555 = arg1.method4934();
		} else if (arg0 == 3) {
			this.aBoolean607 = true;
		} else if (arg0 == 4) {
			this.anInt8556 = -1;
			return;
		}
	}
}
