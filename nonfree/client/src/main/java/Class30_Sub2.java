import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!w", name = "v", descriptor = "Z")
	private boolean aBoolean244;

	@OriginalMember(owner = "client!w", name = "x", descriptor = "Lclient!kb;")
	private Class42 aClass42_8;

	@OriginalMember(owner = "client!w", name = "C", descriptor = "Z")
	private boolean aBoolean245;

	@OriginalMember(owner = "client!w", name = "E", descriptor = "I")
	private int anInt2753;

	@OriginalMember(owner = "client!w", name = "F", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!w", name = "A", descriptor = "Lclient!aa;")
	private final Class2 aClass2_4;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lclient!aa;)V")
	public Class30_Sub2(@OriginalArg(0) Class2 arg0) {
		this.aClass2_4 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	@Override
	public void method1882() {
		if (this.aClass42_8 == null || this.aClass42_8.anInt1395 == 0) {
			return;
		}
		if (this.aClass42_8.anInt1395 == 1) {
			@Pc(22) Class53 local22 = (Class53) this.aClass42_8.anObject2;
			try {
				local22.method1173(0, this.aByteArray23.length, this.aByteArray23);
				local22.method1175();
				try {
					Static119.method1177("midibox.loop=" + (this.aBoolean244 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local22.method1172().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt2753 + ";", this.aClass2_4.anApplet1);
					this.aBoolean245 = true;
				} catch (@Pc(76) Throwable local76) {
				}
			} catch (@Pc(78) Exception local78) {
				try {
					local22.method1175();
				} catch (@Pc(83) Exception local83) {
				}
			}
		}
		this.aClass42_8 = null;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
	@Override
	public void method1881() {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V")
	@Override
	public void method1873(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([BIBZ)V")
	@Override
	public void method1875(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		this.aClass42_8 = this.aClass2_4.method8();
		if (this.aClass42_8 == null) {
			return;
		}
		if (arg1 == 0) {
			arg1 = 1;
		}
		this.anInt2753 = Static44.method808(arg1);
		this.aBoolean244 = arg2;
		this.aByteArray23 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IBI)V")
	@Override
	public void method1878(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			arg0 = 1;
		}
		@Pc(14) int local14 = Static44.method808(arg0) - arg1;
		if (this.aClass42_8 != null) {
			this.anInt2753 = local14;
		} else if (this.aBoolean245) {
			try {
				Static119.method1177("midibox.volume=" + local14 + ";", this.aClass2_4.anApplet1);
				return;
			} catch (@Pc(43) Throwable local43) {
				return;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	@Override
	public void method1883() {
		if (this.aBoolean245) {
			try {
				Static119.method1177("midibox.src=\"c:/silence.mid\";", this.aClass2_4.anApplet1);
			} catch (@Pc(19) Throwable local19) {
			}
			this.aBoolean245 = false;
		}
		this.aClass42_8 = null;
	}
}
