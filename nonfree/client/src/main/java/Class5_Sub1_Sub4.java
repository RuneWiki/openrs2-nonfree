import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class5_Sub1_Sub4 extends Class5_Sub1 {

	@OriginalMember(owner = "client!us", name = "v", descriptor = "I")
	private int anInt9877;

	@OriginalMember(owner = "client!us", name = "z", descriptor = "Ljava/lang/String;")
	private String aString109;

	@OriginalMember(owner = "client!us", name = "C", descriptor = "Ljava/lang/String;")
	private String aString110;

	@OriginalMember(owner = "client!us", name = "D", descriptor = "Ljava/lang/String;")
	private String aString111;

	@OriginalMember(owner = "client!us", name = "G", descriptor = "I")
	private int anInt9884;

	@OriginalMember(owner = "client!us", name = "I", descriptor = "F")
	private float aFloat172;

	@OriginalMember(owner = "client!us", name = "K", descriptor = "F")
	private float aFloat173;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class5_Sub1_Sub4(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!jagtheora/ogg/OggPacket;)V")
	@Override
	protected void method8220(@OriginalArg(1) OggPacket arg0) {
		if (super.anInt9874 > 0 && !"SUB".equals(this.aString110)) {
			return;
		}
		@Pc(24) Class5_Sub15 local24 = new Class5_Sub15(arg0.getData());
		@Pc(30) int local30 = local24.method3642();
		if (super.anInt9874 > 8) {
			if (local30 == 0) {
				@Pc(121) long local121 = local24.method3672();
				@Pc(125) long local125 = local24.method3672();
				@Pc(129) long local129 = local24.method3672();
				if (local121 < 0L || local125 < 0L || local129 < 0L || local121 < local129) {
					throw new IllegalStateException();
				}
				this.aFloat172 = (float) ((local121 + local125) * (long) this.anInt9884) / (float) this.anInt9877;
				this.aFloat173 = (float) (local121 * (long) this.anInt9884) / (float) this.anInt9877;
				@Pc(185) int local185 = local24.method3653();
				if (local185 < 0 || local185 > local24.aByteArray45.length - local24.anInt4144) {
					throw new IllegalStateException();
				}
				this.aString111 = Static29.method390(local24.aByteArray45, local24.anInt4144, local185);
			}
			if ((local30 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local30 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt9874 != 0) {
			return;
		}
		local24.anInt4144 += 23;
		this.anInt9877 = local24.method3653();
		this.anInt9884 = local24.method3653();
		if (this.anInt9877 != 0 && this.anInt9884 != 0) {
			@Pc(84) Class5_Sub15 local84 = new Class5_Sub15(16);
			local24.method3650(0, 16, local84.aByteArray45);
			this.aString109 = local84.method3661();
			local84.anInt4144 = 0;
			local24.method3650(0, 16, local84.aByteArray45);
			this.aString110 = local84.method3661();
			return;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!us", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method8226() {
		return this.aString109;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)F")
	public float method8228() {
		return this.aFloat172;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(B)F")
	public float method8229() {
		return this.aFloat173;
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(B)Ljava/lang/String;")
	public String method8230() {
		return this.aString111;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	@Override
	public void method8219() {
	}
}
