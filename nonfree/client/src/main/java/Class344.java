import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class344 {

	@OriginalMember(owner = "client!we", name = "d", descriptor = "I")
	public int anInt9590;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public int anInt9592;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!ni;")
	public Class226 aClass226_4;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Z")
	public boolean aBoolean712 = false;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIILclient!oa;)Lclient!xa;")
	public Class66 method7999(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class9 arg2) {
		@Pc(24) long local24 = (long) (arg2.anInt6348 << 19 | (arg0 ? 262144 : 0) | arg1 << 16 | this.anInt9590);
		@Pc(32) Class66 local32 = (Class66) this.aClass226_4.aClass245_50.method6082(local24);
		if (local32 != null) {
			return local32;
		} else if (this.aClass226_4.aClass168_85.method4427(this.anInt9590)) {
			@Pc(56) Class1 local56 = Static583.method55(this.aClass226_4.aClass168_85, this.anInt9590, 0);
			if (local56 != null) {
				local56.anInt26 = local56.anInt29 = local56.anInt28 = local56.anInt31 = 0;
				if (arg0) {
					local56.method48();
				}
				for (@Pc(76) int local76 = 0; local76 < arg1; local76++) {
					local56.method52();
				}
			}
			local32 = arg2.method5412(local56);
			if (local32 != null) {
				this.aClass226_4.aClass245_50.method6075(local32, local24);
			}
			return local32;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!iaa;B)V")
	public void method8001(@OriginalArg(0) Class6_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4966();
			if (local5 == 0) {
				return;
			}
			this.method8003(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)Z")
	public boolean method8002() {
		return this.aClass226_4.aClass168_85.method4427(this.anInt9590);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!iaa;I)V")
	private void method8003(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt9590 = arg1.method4999();
		} else if (arg0 == 2) {
			this.anInt9592 = arg1.method4949();
		} else if (arg0 == 3) {
			this.aBoolean712 = true;
		} else if (arg0 == 4) {
			this.anInt9590 = -1;
		}
	}
}
