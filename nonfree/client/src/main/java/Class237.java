import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class237 implements Runnable {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Lclient!mj;")
	public Class156 aClass156_5;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "[Lclient!it;")
	public final Class119[] aClass119Array1 = new Class119[2];

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "Z")
	public volatile boolean aBoolean486 = false;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "Z")
	public volatile boolean aBoolean485 = false;

	static {
		new Class57("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!vk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean485 = true;
		try {
			while (!this.aBoolean486) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class119 local19 = this.aClass119Array1[local12];
					if (local19 != null) {
						local19.method4981();
					}
				}
				Static37.method613(10L);
				Static182.method2842(this.aClass156_5, null);
			}
		} catch (@Pc(43) Exception local43) {
			Static355.method5328(null, local43);
		} finally {
			@Pc(53) Object local53 = null;
			this.aBoolean485 = false;
		}
	}
}
