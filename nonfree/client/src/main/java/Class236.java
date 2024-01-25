import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class236 {

	@OriginalMember(owner = "client!th", name = "d", descriptor = "I")
	public int anInt6426;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!nj;")
	public Class164 aClass164_4;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "I")
	public int anInt6427;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "Z")
	public boolean aBoolean553 = false;

	static {
		new Class189("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!cu;II)V")
	private void method4998(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6427 = arg0.method2588();
		} else if (arg1 == 2) {
			this.anInt6426 = arg0.method2604();
		} else if (arg1 == 3) {
			this.aBoolean553 = true;
		} else if (arg1 == 4) {
			this.anInt6427 = -1;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)Z")
	public boolean method4999() {
		return this.aClass164_4.aClass32_58.method800(this.anInt6427);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!cu;I)V")
	public void method5000(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2582();
			if (local3 == 0) {
				return;
			}
			this.method4998(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIILclient!qa;)Lclient!f;")
	public Class8 method5001(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class172 arg2) {
		@Pc(28) long local28 = (long) (arg2.anInt6964 << 19 | (arg0 ? 262144 : 0) | this.anInt6427 | arg1 << 16);
		@Pc(36) Class8 local36 = (Class8) this.aClass164_4.aClass126_32.method3141(local28);
		if (local36 != null) {
			return local36;
		} else if (this.aClass164_4.aClass32_58.method800(this.anInt6427)) {
			@Pc(58) Class264 local58 = Static464.method5847(this.aClass164_4.aClass32_58, this.anInt6427, 0);
			if (local58 != null) {
				local58.anInt7506 = local58.anInt7503 = local58.anInt7505 = local58.anInt7504 = 0;
				if (arg0) {
					local58.method5846();
				}
				for (@Pc(78) int local78 = 0; local78 < arg1; local78++) {
					local58.method5848();
				}
			}
			local36 = arg2.method5542(local58);
			if (local36 != null) {
				this.aClass164_4.aClass126_32.method3132(local28, local36);
			}
			return local36;
		} else {
			return null;
		}
	}
}
