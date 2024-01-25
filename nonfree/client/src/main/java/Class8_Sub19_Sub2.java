import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class8_Sub19_Sub2 extends Class8_Sub19 {

	@OriginalMember(owner = "client!is", name = "x", descriptor = "Ljava/lang/String;")
	private String aString64;

	@OriginalMember(owner = "client!is", name = "C", descriptor = "F")
	private float aFloat101;

	@OriginalMember(owner = "client!is", name = "D", descriptor = "Ljava/lang/String;")
	private String aString65;

	@OriginalMember(owner = "client!is", name = "G", descriptor = "F")
	private float aFloat102;

	@OriginalMember(owner = "client!is", name = "H", descriptor = "I")
	private int anInt5341;

	@OriginalMember(owner = "client!is", name = "J", descriptor = "Ljava/lang/String;")
	private String aString66;

	@OriginalMember(owner = "client!is", name = "K", descriptor = "I")
	private int anInt5342;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!jagtheora/ogg/OggStreamState;)V")
	public Class8_Sub19_Sub2(@OriginalArg(0) OggStreamState arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!jagtheora/ogg/OggPacket;I)V")
	@Override
	protected void method7895(@OriginalArg(0) OggPacket arg0) {
		if (super.anInt9770 > 0 && !"SUB".equals(this.aString64)) {
			return;
		}
		@Pc(21) Class8_Sub8 local21 = new Class8_Sub8(arg0.getData());
		@Pc(33) int local33 = local21.method8525();
		if (super.anInt9770 > 8) {
			if (local33 == 0) {
				@Pc(125) long local125 = local21.method8524();
				@Pc(129) long local129 = local21.method8524();
				@Pc(133) long local133 = local21.method8524();
				if (local125 < 0L || local129 < 0L || local133 < 0L || local125 < local133) {
					throw new IllegalStateException();
				}
				this.aFloat101 = (float) (local125 * (long) this.anInt5341) / (float) this.anInt5342;
				this.aFloat102 = (float) ((local125 + local129) * (long) this.anInt5341) / (float) this.anInt5342;
				@Pc(190) int local190 = local21.method8526();
				if (local190 < 0 || local190 > local21.aByteArray107.length - local21.anInt10588) {
					throw new IllegalStateException();
				}
				this.aString65 = Static38.method1276(local21.aByteArray107, local21.anInt10588, local190);
			}
			if ((local33 | 0x80) != 0) {
				return;
			}
			return;
		}
		if ((local33 | 0x80) == 0) {
			throw new IllegalStateException();
		}
		if (super.anInt9770 != 0) {
			return;
		}
		local21.anInt10588 += 23;
		this.anInt5342 = local21.method8526();
		this.anInt5341 = local21.method8526();
		if (this.anInt5342 != 0 && this.anInt5341 != 0) {
			@Pc(88) Class8_Sub8 local88 = new Class8_Sub8(16);
			local21.method8563(0, local88.aByteArray107, 16);
			this.aString66 = local88.method8570();
			local88.anInt10588 = 0;
			local21.method8563(0, local88.aByteArray107, 16);
			this.aString64 = local88.method8570();
			return;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!is", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method4355() {
		return this.aString66;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)F")
	public float method4357() {
		return this.aFloat102;
	}

	@OriginalMember(owner = "client!is", name = "f", descriptor = "(I)V")
	@Override
	public void method7896() {
	}

	@OriginalMember(owner = "client!is", name = "i", descriptor = "(I)F")
	public float method4358() {
		return this.aFloat101;
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(Z)Ljava/lang/String;")
	public String method4359() {
		return this.aString65;
	}
}
