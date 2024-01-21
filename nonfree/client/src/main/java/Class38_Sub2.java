import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!t", name = "A", descriptor = "Z")
	private boolean aBoolean154;

	@OriginalMember(owner = "client!t", name = "C", descriptor = "Lclient!qb;")
	private Class54 aClass54_5;

	@OriginalMember(owner = "client!t", name = "E", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!t", name = "G", descriptor = "Z")
	private boolean aBoolean155;

	@OriginalMember(owner = "client!t", name = "W", descriptor = "I")
	private int anInt2487;

	@OriginalMember(owner = "client!t", name = "B", descriptor = "Lclient!jc;")
	private final Class35 aClass35_4;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class38_Sub2(@OriginalArg(0) Class35 arg0) {
		this.aClass35_4 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V")
	@Override
	public void method1586(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
	@Override
	public void method1584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			arg0 = 1;
		}
		@Pc(17) int local17 = Static53.method830(arg0) - arg1;
		if (this.aClass54_5 != null) {
			this.anInt2487 = local17;
		} else if (this.aBoolean155) {
			try {
				Static113.method510(this.aClass35_4.anApplet1, "midibox.volume=" + local17 + ";");
				return;
			} catch (@Pc(45) Throwable local45) {
				return;
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	@Override
	public void method1577() {
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	@Override
	public void method1581() {
		if (this.aBoolean155) {
			try {
				Static113.method510(this.aClass35_4.anApplet1, "midibox.src=\"c:/silence.mid\";");
			} catch (@Pc(11) Throwable local11) {
			}
			this.aBoolean155 = false;
		}
		this.aClass54_5 = null;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	@Override
	public void method1579() {
		if (this.aClass54_5 == null || this.aClass54_5.anInt2217 == 0) {
			return;
		}
		if (this.aClass54_5.anInt2217 == 1) {
			@Pc(31) Class8 local31 = (Class8) this.aClass54_5.anObject3;
			try {
				local31.method267(0, this.aByteArray22.length, this.aByteArray22);
				local31.method266();
				try {
					Static113.method510(this.aClass35_4.anApplet1, "midibox.loop=" + (this.aBoolean154 ? "\"infinite\"" : "0") + "; midibox.src=\"" + local31.method263().getPath().replace('\\', '/') + "\"; midibox.volume=" + this.anInt2487 + ";");
					this.aBoolean155 = true;
				} catch (@Pc(83) Throwable local83) {
				}
			} catch (@Pc(85) Exception local85) {
				try {
					local31.method266();
				} catch (@Pc(90) Exception local90) {
				}
			}
		}
		this.aClass54_5 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI[BI)V")
	@Override
	public void method1578(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		this.aClass54_5 = this.aClass35_4.method771();
		if (this.aClass54_5 == null) {
			return;
		}
		if (arg1 == 0) {
			arg1 = 1;
		}
		this.anInt2487 = Static53.method830(arg1);
		this.aBoolean154 = arg0;
		this.aByteArray22 = arg2;
	}
}
